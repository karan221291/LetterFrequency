import java.io.BufferedReader; 
    import java.io.IOException; 
    import java.io.InputStreamReader; 
    import java.util.TreeMap;
    import java.util.Map;
    import java.util.Iterator;
    
    public class Test 
    { 
    	public static void main(String[] args) throws IOException 
    	{ 
    		//Enter data using BufferReader 
    		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    		
    		// Reading data using readLine 
    		String name = reader.readLine(); 
    		
    		// Replace every characters other than alphanumeric characters
    		name = name.replaceAll("[^\\p{L}\\d]","");
    		
    		Integer val;
            TreeMap<Character, Integer> map = new TreeMap<>();
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                val = map.get(c);
                
                if (val != null) {
                    // If char already exist add to count.
                    map.put(c, new Integer(val + 1));
                }
                else {
                    // If char doesn't exist add to map with start count '1' 
                    map.put(c, 1);
                }
            }
        
            // Print frequency to output.
            String key, value;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                key = Character.toString(entry.getKey());
                value = String.valueOf(entry.getValue());
                System.out.println(key+": "+value);
            }
    	} 
    }