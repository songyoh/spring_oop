package chap03_02sip.segregate;

public interface ArticleRepositoryInterface {
    void createArticle();
    Article findArticleById(Long id);
}
