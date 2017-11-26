$(function(){
    var webSocket = new WebSocket('ws://localhost:8080/SSM/websocketTest');

    webSocket.onerror = function(event) {
        onError(event)
    };

    webSocket.onopen = function(event) {
        onOpen(event)
    };

    webSocket.onmessage = function(event) {
        onMessage(event)
    };

    $("#start").click(function(){
        webSocket.send("hello");
    });
});

function onMessage(event) {
    $("#message").val(event.data);
}

function onOpen(event) {
    $("#message").val("Hello ，connection ready !");
}

function onError(event) {
    alert(event.data);
}