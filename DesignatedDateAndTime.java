public class DesignatedDateAndTime{
        private String year, month, day, hour, minute;
        public DesignatedDateAndTime(String year, String month, String day, String hour, String minute){
            this.year = year;
            this.month = month;
            this.day = day;
            this.hour = hour;
            this.minute = minute;
        }

        public String getScheduleDateTime(){
                return this.year + "-" + this.month + "-" + this.day + " " + this.hour + ":" + this.minute;
        }
        public String getYear(){
            return this.year;
        }

        public String getMonth(){
            return this.month;
        }

        public String getDay(){
            return this.day;
        }

        public String getHour(){
            return this.hour;
        }

        public String getMinute(){
            return this.minute;
        }
}