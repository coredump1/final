import java.util.Date;

import javax.persistence.*;

@Entity
public class Ele {
@Id String P_name;
String D_type;
int Price;
String M_date;
public Ele(String p_name, String d_type, int price, String str) {
	
	P_name = p_name;
	D_type = d_type;
	Price = price;
	M_date = str;
}
public String getP_name() {
	return P_name;
}
public void setP_name(String p_name) {
	P_name = p_name;
}
public String getD_type() {
	return D_type;
}
public void setD_type(String d_type) {
	D_type = d_type;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
public String getM_date() {
	return M_date;
}
public void setM_date(String m_date) {
	M_date = m_date;
}

public String toString()
{
return "Product name:  "+P_name+ "D_type : "+D_type+ "Price :"+Price+ "M_date:"+M_date;	
}

}
