# Hướng dẫn cài đặt và chạy dự án A2N

## Mô tả
    `Add2Num` là một project Java thực hiện các phép tính trên các số lớn (BigNumber).  
    Project sử dụng **Apache Maven** để quản lý build, dependency và chạy Unit Test.

## yêu cầu.
    -java 17 trở lên
    -Maven 3.6 trở lên
    -Git được cài trên máy
    -Hệ điều hành: Windows

## Cấu trúc project
    -src/main/java: Chứa mã nguồn chính của dự án.
    -src/test/java: Chứa các lớp kiểm thử đơn vị (Unit Test).
    -target: Thư mục output Maven (jar, class files)
    -pom.xml: Tệp cấu hình Maven, quản lý dependency và các thiết lập build.

## Các bước thực hiện:
### Bước 1: clone source code
    git clone https://github.com/DinhHieu2004/A2N
### Bước 2: chuyển qua nhánh core
    git checkout core
### Bước 3: di chuyển vào thư mục dự án
    cd A2N
### Bước 4: biên dịch dự án
     mvn clean package
### Bước 5: chạy unit test
    mvn test