package com.example.kotlin_chat_application

import android.content.IntentSender

class Message {
    var message : String? = null
    var senderId : String? = null

    constructor(){}

    constructor(message: String?, senderId: String?) {
        this.message = message
        this.senderId = senderId
    }
}