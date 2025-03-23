package dsa1;

import java.util.ArrayList;

public class PatientPriority {
    int iD;
    int patientPriority;
    public PatientPriority(int iD, int patientPriority) {
        this.iD = iD;
        this.patientPriority = patientPriority;
    }

    public int getID() {
        return iD;
    }

    public int getPatientPriority() {
        return patientPriority;
    }
    @Override
    public String toString() {
        return "PatientPriority{" + "iD=" + iD + ", patientPriority=" + patientPriority + '}'+"\n";
    }

}
class PQ{
    ArrayList<PatientPriority> pq;
    public PQ(){
        pq = new ArrayList<PatientPriority>();
    }
    public void addPatientPriority(PatientPriority p){
        int i=0;
        while(i<pq.size()){
            if(pq.get(i).getPatientPriority()>p.getPatientPriority()){
               break;
            }
            i++;
        }
        pq.add(i,p);
    }
    public PatientPriority poll(){
        if(pq.isEmpty()){
            return null;
        }
        return pq.remove(0);
    }
    public void examinePriorityPatient(){
        System.out.println("Patients are examined in the following order:");
       while(!pq.isEmpty()){
           PatientPriority patient = poll();
           System.out.println("Treating:" + patient);
       }
    }

    public static void main(String[] args) {
        PQ pq = new PQ();
        pq.addPatientPriority(new PatientPriority(1,4));
        pq.addPatientPriority(new PatientPriority(2,3));
        pq.addPatientPriority(new PatientPriority(3,2));
        pq.addPatientPriority(new PatientPriority(4,1));
        pq.addPatientPriority(new PatientPriority(5,0));
        pq.examinePriorityPatient();
    }
}
