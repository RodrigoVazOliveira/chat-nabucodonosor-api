var ws = require('ws');
const stompJs = require('@stomp/stompjs');

const client = new stompJs.Client({
    brokerURL: 'ws://localhost:8080/chat',
    debug: (str) => {
        console.log(str);
    },
    webSocketFactory: () => {
        return new ws('ws://localhost:8080/chat');
    },
    reconnectDelay: 5000,
    heartbeatIncoming: 4000,
    heartbeatOutgoing: 4000,
    logRawCommunication: true
});

client.onConnect = (frame) => {
    console.info('Conection in ' + frame);
    client.publish({
        destination: '/send',
        body: JSON.stringify({
            sender: 'Rodrigo@gmail.com',
            message: 'Essa e minha mensagem de testes'
        })
    });

    client.subscribe('/topic/public', (message) => {
        console.info('Resultado: ' + message);
    });
};


client.onStompError = function (frame) {
    // Will be invoked in case of error encountered at Broker
    // Bad login/passcode typically will cause an error
    // Complaint brokers will set `message` header with a brief message. Body may contain details.
    // Compliant brokers will terminate the connection after any error
    console.log('Broker reported error: ' + frame.headers['message']);
    console.log('Additional details: ' + frame.body);
};

client.onWebSocketError = (error) => {
    console.error("Error in websocket " + JSON.stringify(error));
};

client.activate();



