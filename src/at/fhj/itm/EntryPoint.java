package at.fhj.itm;

public class EntryPoint {

	public static void main(String[] args) {
		ICommandLineDistance dist = new CommandLineDistance();
		
		if(args.length != dist.getMinArguments()){
			System.out.println(dist.getUsage());
			return;
		}
		
		try
		{
			double result = dist.distCommandLine(args);
			System.out.println(result);
		}
		catch(Exception ex)
		{
			System.out.print("Invalid math operation: " + ex.getMessage());
			
		}
		
	}

}
