package chap03_02sip.segregate;

public class UserService {
    // 현업에서는 피드백을 이렇게 주심.(ex. SIP 위반입니다. LSP 위반입니다. OCP 위반입니다. ~원칙이 위배되었습니다.)
    private UserRepositoryInterface repository = new UserRepository();

    public void createUser() {
        repository.createUser();
    }

    public User findUserById(Long id) {
        return repository.findUserById(id);
    }
}
