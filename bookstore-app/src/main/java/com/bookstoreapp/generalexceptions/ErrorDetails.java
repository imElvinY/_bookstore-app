package com.bookstoreapp.generalexceptions;

import java.time.LocalDateTime;

public record ErrorDetails(

        LocalDateTime timeStamp,

        String message,

        String details

) {
}
