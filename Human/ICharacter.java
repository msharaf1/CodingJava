public inteface ICharacter{
    Random randomGenerator = new Random();
    String getName();
    double geetHealth();
    long getExpereince();
    int getAttackPower();
    void setAttackPower();

    void defend();
    void jump();
    int heal();
    void attack(ICharacter opponent);
    double decreasehealth(int opponentAttackPower);
    long gainExpereince(long experince);
}