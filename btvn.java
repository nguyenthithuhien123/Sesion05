import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class btvn {
    public static void main(String[] args) {
        /**Quan ly thong tin cua 1 sinh vien
         =====Bài tâp===
         1. Nhap vao ma sinh vien
         2. Nhap vao ho ten
         3. so diejnd thoại
         4. Nhập vào ngày tháng năm sinh
         5. In thông tin sinh vien

         Validate dữ liệu nhập vào
         mã sinh viên phải bắt đầu bằng chữ B sau là 3 số (VD : B200)
         Ho ten khong chua ky tu dac biet trừ khoảng trắng có tối thiểu 10 ký tự
         Phone Đúng định dạng Đông Lào
         Năm sinh phải đúng yy/mmm/dd (05/10/1994)*/
        Scanner sc = new Scanner(System.in);
        String msv="";
        String fullName="";
        String telePhoneNumber="";
        String birtday="";
        do {
            System.out.println(" ========== Mennu ==========");
            System.out.println("""
                    1. Nhap vao ma sinh vien
                    2. Nhap vao ho ten
                    3. so dien thoại
                    4. Nhập vào ngày tháng năm sinh
                    5. In thông tin sinh vien
                    """);
            System.out.println("Lựa chọn của bạn: ");
           int chose = Integer.parseInt(sc.nextLine());
            switch (chose){
                case 1:
                    System.out.println("Mời bạn nhập mã sinh viên:");
                    do {
                         msv = sc.nextLine();
                        Pattern patten = Pattern.compile("B([0-9]){3}");
                        Matcher macher = patten.matcher(msv);
                        boolean check = macher.matches();
                        if (check){
                            System.out.println("Mã sinh viên hợp lệ");
                        break;
                        }else {
                            System.err.println("Mã sinh viên không hợp lệ");
                        }
                    }while (true);
                    break;
                case 2:
                    System.out.println("Mời nhập họ tên sinh viên");
                    do {
                     fullName = sc.nextLine();
                    Pattern pattern = Pattern.compile("([a-zA-Z\s]){10,}");
                    Matcher macher = pattern.matcher(fullName);
                    boolean check = macher.matches();
                    if (check){
                        System.out.println("Họ tên hợp lý");
                        break;
                    }else {
                        System.err.println("Họ tên không hợp lý mởi nhập lại:");
                    }
                    }while (true);
                    break;
                case 3:
                    System.out.println("Mời nhập số điện thoại");
                    do {
                        telePhoneNumber = sc.nextLine();
                        Pattern pattern = Pattern.compile("0([379])([0-9]{8})");
                        Matcher macher = pattern.matcher(telePhoneNumber);
                        boolean check = macher.matches();
                        if (check){
                            System.out.println("Số điện thoại hợp lý");
                            break;
                        }else {
                            System.err.println("Số điện thoại không hợp lý mởi nhập lại:");
                        }
                    }while (true);
                    break;
                case 4:
                    System.out.println("Mời nhập ngày tháng năm sinh");
                    do {
                        birtday = sc.nextLine();
                        Pattern pattern = Pattern.compile("\\d{4}/\\d{2}/\\d{2}");
                        Matcher macher = pattern.matcher(birtday);
                        boolean check = macher.matches();
                        if (check){
                            System.out.println("ngày tháng năm sinh hợp lý");
                            break;
                        }else {
                            System.err.println("ngày tháng năm sinh không hợp lý mởi nhập lại:");
                        }
                    }while (true);
                    break;
                case 5:
                    System.out.println(msv);
                    System.out.println(fullName);
                    System.out.println(telePhoneNumber);
                    System.out.println(birtday);
                    break;
                default:
                    System.err.println("Mời bạn nhập từ 0-5!");
            }
        }while (true);
    }
}
