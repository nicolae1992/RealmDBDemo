package nicolae.cozma.realmdbdemo.model

enum class SyncState(val state: String) {
    PENDING("Pending"),
    SYNCED("Synced"),
    ERROR("Error");
}