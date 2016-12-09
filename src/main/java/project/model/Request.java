package project.model;

/**
 * Created by Наиль on 19.11.2016.
 */
/*@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REQUEST_ID")
    private Long id;

    @Column(name = "OWNER_ID")
    private Long ownerId;

    @Column(name = "PROBLEM")
    private String problem;

    @Column(name = "COST")
    private int cost;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_ID")
    private Car car;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID")
    private Owner owner;

    protected Request(){

    }

    public Request(String problem, int cost){
        this.problem = problem;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Request:{ " +
                "Owner id = " + ownerId + "| " +
                "Problem = " + problem + "| " +
                "Cost = " + cost + "}";
    }
}
*/