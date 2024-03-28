class string_methods
{
	public static void main(String a[])
	{
		String name = "Sneha";
		int value = name.length();
		System.out.println(value);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String nonTrimmedString = "      Sneha  ";
		System.out.println(nonTrimmedString.trim());
		
	}
}