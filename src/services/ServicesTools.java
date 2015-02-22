package services;

import org.json.JSONException;
import org.json.JSONObject;

public class ServicesTools {
	public static JSONObject createUser(String login, String password,
			String firstname,String lastname) throws JSONException{
			
		JSONObject json= new JSONObject();
		
		if(login==null||password==null||firstname==null||lastname==null)
		{	
			try 
			{
				json.put("error", -1);
				json.put("output","Missing parameter for:"+login+" "+password+" "+firstname+
						" "+lastname);
			}catch (JSONException e){
				e.printStackTrace();
			}
		}else{
			synchronized ("create"){
				json.put("output","login:"+login+" password:"+password);
				
			} 
		}
		
		return json;
	}
	
	public static JSONObject logout(String key) throws JSONException{
			
		JSONObject json= new JSONObject();
		
		if(key==null)
		{	
			try 
			{
				json.put("error", -1);
				json.put("output","Missing parameter for: key");
			}catch (JSONException e){
				e.printStackTrace();
			}
		}else{
			synchronized ("logout"){
				json.put("You did it !",1);
			} 
		}
		
		return json;
	}
	public static JSONObject loginUser(String login, String password) throws JSONException
	{
		JSONObject json = new JSONObject();
		if(login==null||password==null)
		{
			try
			{
				json.put("error", -1);
				json.put("message", "Missing parameter for:"+login+" "+password+" ");
			}catch (JSONException e){
				e.printStackTrace();
			}
		}else{
			synchronized("login")
			{
				int key=1;
				json.put("message", "login:"+login+" password:"+password+" session_key:"+key);
			}
		}
		
		return json;
	}
	
	public static JSONObject addComment(String key, String text) throws JSONException
	{
		JSONObject json = new JSONObject();
		if(text==null||key==null)
		{
			try
			{
				json.put("error", -1);
				json.put("message", "Missing parameter for: text="+text+" key="+key+" ");
			}catch (JSONException e){
				e.printStackTrace();
			}
		}else{
			synchronized("login")
			{
				//I have no idea why there is an init key=1
				//int key=1;
				json.put("message", "key:"+key+" text:"+text+" session_key:"+key);
			}
		}
		
		return json;
	}
	
	public static JSONObject removeFriend(String key, String id_friend) throws JSONException
	{
		JSONObject json = new JSONObject();
		if(key==null||id_friend==null)
		{
			try
			{
				json.put("error", -1);
				json.put("message", "Missing parameter for: id_friend="+id_friend+" key="+key+" ");
			}catch (JSONException e){
				e.printStackTrace();
			}
		}else{
			synchronized("login")
			{
				//I have no idea why there is an init key=1
				//int key=1;
				json.put("message", "key:"+key+" id_friend:"+id_friend+" session_key:"+key);
			}
		}
		
		return json;
	}
	
	public static JSONObject addFriend(String key, String id_friend) throws JSONException
	{
		JSONObject json = new JSONObject();
		if(key==null||id_friend==null)
		{
			try
			{
				json.put("error", -1);
				json.put("message", "Missing parameter for: id_friend="+id_friend+" key="+key+" ");
			}catch (JSONException e){
				e.printStackTrace();
			}
		}else{
			synchronized("login")
			{
				//I have no idea why there is an init key=1
				//int key=1;
				json.put("message", "key:"+key+" id_friend:"+id_friend+" session_key:"+key);
			}
		}
		
		return json;
	}
	

}
