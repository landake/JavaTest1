public class Employee {
    //员工类
        private String name;     // 姓名
        private int salary;      // 工资薪金所得

        Employee(String name){ // 带参数的构造方法

            this.name = name;

        }

        Employee(String name,int salary){  // 带参数的构造方法
            this.name = name;
            this.salary = salary;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }


        public void selfTax(){ // 个人所得税具体计算

            double selfTax;

            if(salary>=0 && salary<1500){

                selfTax = (double)(salary)*0.03 - 0;

            }else if(salary>=1500 && salary<4500){

                selfTax = (double)(salary)*0.1 - 105;

            }else if(salary>=4500 && salary<9000){

                selfTax = (double)(salary)*0.2 - 555;
       }else if(salary>=9000 && salary<35000){

                selfTax = (double)(salary)*0.25 - 1005;

            }else if(salary>=35000 && salary<55000){

                selfTax = (double)(salary)*0.30 - 2755;

            }else if(salary>=55000 && salary<80000){

                selfTax = (double)(salary)*0.35 - 5505;

            }else{

                selfTax = (double)(salary)*0.45 - 13505;

            }

            System.out.println(selfTax);

        }

    }

