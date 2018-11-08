/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

/**
 *
 * @author liang_jiaqi
 */
public class Local extends Person
{
    private Activity * activityListHead;
    private Activity * activityListTail;
    private int acticityListSize;
    public Local(String name,  int age ,String email, int zip,  char gender, String password)
    {
        super( name,   age , email,  zip,   gender,  password);
    }
    public void getActivity()
    {
        //need to know what do we have in activity
        
    }
    
    public void setActivity(Activity newActivity)
    {
        //need to know what do we have in activity
        //link list ver.
        /*
        if(activityListHead->isEmpty())
        {
            activityListHead = newActivity;
            activityListTail = activityListHead;
            acticityListSize++;
        }
        else
        {
            activityListTail->next = newActivity;
            activityListTail = activityListTail->next;
            activityListSize++;
        }
        
        */
    }
    public void rating()
    {
        //To do
    }
    public void availability()
    {
        
        //To do
        
    }
            
            
            
            
            
            
}