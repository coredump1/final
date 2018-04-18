import javax.persistence.*;
import java.util.*;
public class Main {
	static int i;
	static Scanner sc=new Scanner(System.in);
	static EntityManagerFactory
	emf=Persistence.createEntityManagerFactory("E4.odb");
	static EntityManager em=emf.createEntityManager();
	static void insert() 
	{
		em.getTransaction().begin();
		System.out.println("Enter no records");
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter P_name");
			String P_name=sc.next();
			
			System.out.println("Enter D_type");
			String D_type=sc.next();
			
			System.out.println("Enter Price");
			int Price=sc.nextInt();
			
			System.out.println("Enter M_date");
			String str=sc.next();
			//Date M_date=sdf.parse(str);
			
			
			 Ele e=new Ele(P_name,D_type,Price,str);
			
			em.persist(e);
		
		}
		em.getTransaction().commit();
		
	}
	static void display()
	{
		em.getTransaction().begin();
//		String q="SELECT emp from Emp emp where runs > 9000";
		//String q="SELECT emp from Emp emp order by no_of_matches desc";
		String q="select eq from Ele eq order by Price asc";
		TypedQuery<Ele> a = em.createQuery(q,Ele.class);
		
		List<Ele> l =a.getResultList();
		for(Ele e:l)
		{
			System.out.println(e.toString());
			
		}
		
		
		em.getTransaction().commit();
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//insert();
       display();
	}

}
