package training.supportbank;

import java.math.BigDecimal;

class Person {
        private String name;
        private BigDecimal balance;

        public Person (String name){
                this.name = name;
        }
        public String getName(){
                return name;
        }
        public void changeBalance(BigDecimal value) {
                balance = value;
        }
        public BigDecimal getBalance() {
                return balance;
        }

}
