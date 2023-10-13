var ws = require('ws');
const stompJs = require('@stomp/stompjs');
const prompt = require('prompt-sync')();

const BASE_URL = 'ws://localhost:8080/ws';

const client = new stompJs.Client({
    brokerURL: BASE_URL,
    debug: (str) => {
        console.log(str);
    },
    webSocketFactory: () => {
        return new ws(BASE_URL);
    },
    reconnectDelay: 5000,
    heartbeatIncoming: 4000,
    heartbeatOutgoing: 4000,
    logRawCommunication: true
});

client.onStompError = function (frame) {
    console.log('Broker reported error: ' + frame.headers['message']);
    console.log('Additional details: ' + frame.body);
};

client.onWebSocketError = (error) => {
    console.error("Error in websocket " + JSON.stringify(error));
};

client.onConnect = (frame) => {
    
    let runningProgram = true;

    while (runningProgram) {
        let option;
        option = prompt("deseja enviar uma mensagem? (s, n) ");

        if (option == 's') {
            let sender = prompt('Por favor, digite o destinátario: ');
            let message = prompt('Por favor, digite a mensagem: ');
        
            client.publish({
                destination: '/app/chat.message',
                body: JSON.stringify({
                    sender: sender,
                    message: message
                })
            });
        } else {
            runningProgram = false;
        }
    }
}

client.activate();
