class Main {
    static Hero hero = new Hero("Tirza Unggu", 20);
    static int counter;

    public static void main(String[] args) {
        hero.player();

        
    // Group 3: walk 7x, run 4x, eat 4x, drink 3x, jump 3x, sit 4x, walk 50x, attack 4x    
    // walk 7x
    isWalk(7);

    // run 4x
    isRun(4);

    // eat 4x
    isEat(4);

    // drink 3x
    isDrink(3);

    // jump 3x
    isJump(3);

    // sit 4x
    isSit(4);

    // walk 50x
    isWalk(50);

    // attack 4x
    isAttack(4);
  
      hero.checkWinner();
      hero.player();
   
    }
    
    static void isWalk(int angka) {
      for (counter = 1; counter <= angka; counter++) {
        hero.walk();
      }
    }
    static void isRun(int angka) {
        for (counter = 1; counter <= angka; counter++) {
        hero.run();
      }
    }
    
    static void isEat(int angka) {
        for (counter = 1; counter <= angka; counter++) {
        hero.eat();
      }
    }
    
    static void isDrink(int angka) {
        for (counter = 1; counter <= angka; counter++) {
        hero.drink();
      }
    }

    static void isJump(int angka) {
        for (counter = 1; counter <= angka; counter++) {
        hero.jump();
      }
    }

    static void isSit(int angka) {
        for (counter = 1; counter <= angka; counter++) {
        hero.sit();
      }
    }

    static void isAttack(int angka) {
        for (counter = 1; counter <= angka; counter++) {
        hero.attack();
      }
    }
    
  }
  