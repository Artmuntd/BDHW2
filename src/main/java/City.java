public class City {

        private int id;
        private String cityName;
        private String country;

        public City(int id, String cityName, String country) {
            this.id = id;
            this.cityName = cityName;
            this.country = country;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "City{" +
                    "id=" + id +
                    ", cityName='" + cityName + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }

