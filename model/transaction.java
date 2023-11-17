package model;

public class transaction {
    private int id;
    private int userId;
    private int gameId;

    public Transaction(int id, int userId, int gameId) {
        this.id = id;
        this.userId = userId;
        this.gameId = gameId;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }
}
