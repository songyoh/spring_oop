package chap03_02sip.segregate;

public class ArticleService { // 인터페이스 분리원칙: 도메인별로 인터페이스를 쪼개놔야 된다.
    private ArticleRepositoryInterface repository = new ArticleRepository();

    public void createArticle() {
        repository.createArticle();
    }

    public Article findArticleById(Long id) {
        return repository.findArticleById(id);
    }
}
