public class User {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void searchProduct(String keyword) {
        SearchService searchService = new SearchService();
        searchService.searchProduct(keyword);
    }
}