package junit.testing;


    public class Products {
        public int product_id;
        private String product_name;
        private String product_group;
        private String product_subgroup;
        private float product_price;
        static int id_count =0;

        public Products(String name, String group, String subgroup, float price ){
            this.product_id = id_count;
            this.product_name = name;
            this.product_group= group;
            this.product_subgroup = subgroup;
            this.product_price = price;
            id_count++;
        }

        public String getProduct_name(){
            return product_name;
        }

        public  void setProduct_name(String product_name)
        {
           this.product_name = product_name;
        }

        public String getProduct_group() {
            return product_group;
        }

        public void setProduct_group(String product_group) {
            this.product_group = product_group;
        }

        public String getProduct_subgroup() {
            return product_subgroup;
        }

        public void setProduct_subgroup(String product_subgroup) {
            this.product_subgroup = product_subgroup;
        }

        public float getProduct_price() {
            return product_price;
        }

        public void setProduct_price(int product_price) {
            this.product_price = product_price;
        }
    }
