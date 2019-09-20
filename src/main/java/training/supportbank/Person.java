package training.supportbank;

import java.math.BigDecimal;

class Person {
        private String name;
        private BigDecimal balance = new BigDecimal("0.00");

        public Person (String name){
                this.name = name;
        }
        public String getName(){
                return name;
        }
        public void subtractBalance(String value) {
                BigDecimal amount = new BigDecimal(value);
                balance = balance.subtract(amount);
        }
        public void addBalance(String value) {
                BigDecimal amount = new BigDecimal(value);
                balance = balance.add(amount);
        }
        public BigDecimal getBalance() {
                return balance;
        }

}
