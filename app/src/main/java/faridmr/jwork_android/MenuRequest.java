package faridmr.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class MenuRequest extends StringRequest {
    private static final String URL = "http://10.0.2.2:8080/job/login";
    private Map<String, String> params;

    public MenuRequest(int id,String name,Recruiter recruiter,int fee,String category,Response.Listener<String> listener) {
        super(Request.Method.GET, URL, listener, null);
        params = new HashMap<>();
        params.get(name);
        params.get(recruiter);
        params.get(fee);
        params.get(category);
    }
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}