package chap03_02sip.segregate;

public interface UserRepositoryInterface {
    void createUser();
    User findUserById(Long id);
}
