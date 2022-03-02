package nicolae.cozma.realmdbdemo.model

enum class State(state: String) {
    DRAFT("Draft"),
    SCHEDULED("Scheduled"),
    IN_PROGRESS("In Progress"),
    FINISHED("Finished"),
    CANCELLED("Cancelled"),
}