package BuilderC�digoJunto;


public class Cozinha1 
{
	
	public abstract class SanduicheBuilder 
	{
	      public abstract void abrePao();
	      public abstract void insereIngredientes();
	      public abstract void fechaPao();
	      public abstract Sanduiche getSanduiche();
	}
	
	public void fazSanduiche(SanduicheBuilder builder) 
	{
		builder.abrePao();
		builder.insereIngredientes();
		builder.fechaPao();
	}
	
	
public abstract class Sanduiche 
{

public class Fishburguer extends Sanduiche
{
		public abstract class FishBuilder extends SanduicheBuilder 
        {

			private Sanduiche s = new Fishburguer();
				
				public void abrePao() {
					System.out.println("Abre p�o de fishburguer");
				}
				
				public void insereIngredientes() {
					System.out.println("Insere fil� de peixe");
				}
				
				public void fechaPao() {
					System.out.println("Fecha p�o de fishburguer");
				}
				
				public Sanduiche getSanduiche() {
					System.out.println("Fishburguer est� pronto");
					return s;
				}
		    }
	
public class Hamburguer extends Sanduiche 
{
		public abstract class HamburguerBuilder extends SanduicheBuilder {

			private Sanduiche s = new Hamburguer();
				
				public void abrePao() {
					System.out.println("Abre p�o de hamburguer");
				}
				
				public void insereIngredientes() {
					System.out.println("Insere carne e queijo");
				}
				
				public void fechaPao() {
					System.out.println("Fecha p�o de hamburguer");
				}
				
				public Sanduiche getSanduiche() {
					System.out.println("Hamburguer est� pronto");
					return s;
				}
			}	
		 }
      }
   }
}
