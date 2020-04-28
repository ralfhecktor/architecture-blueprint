package de.ralfhecktor.architectureblueprint.common;

public enum Message {

    ASSERTION_NOT_NULL("The attribute <%s> MUST NOT be null!");

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getFormattedMessage(Object... args) {
        return String.format(message, args);
    }

}
