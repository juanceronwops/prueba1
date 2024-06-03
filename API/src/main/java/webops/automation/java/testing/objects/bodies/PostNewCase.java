package webops.automation.java.testing.objects.bodies;
import webops.automation.java.testing.objects.CaseNote;
import webops.automation.java.testing.objects.ProductSystem;
import webops.automation.java.testing.objects.ShippingInstruction;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class PostNewCase {
    private String messageId;
    private String timestamp;
    private int manufacturerId;
    private int branchId;
    private String externalCaseId;
    private String caseIdentifier;
    private boolean isLoaner;
    private String caseType;
    private String surgeryDate;
    private int salesRepId;
    private int coverageRepId;
    private int physicianId;
    private int hospitalId;
    private int procedureId;
    private String specialInstructions;
    private CaseNote[] caseNotes;
    private String patientGender;
    private int patientAge;
    private boolean revisionSurgery;
    private int revisionReasonId;
    private boolean usePhysicianPref;
    private String userName;
    private ShippingInstruction[] shippingInstructions;
    private ProductSystem[] productSystems;

    public PostNewCase() {
        this.messageId = "2d648c64-3eee-4fc7-9e19-df6f14c3fefd";
        this.timestamp = "2023-10-11T13:15:30Z";
        this.manufacturerId = 1015;
        this.branchId = 149;
        this.externalCaseId = "W007";
        this.caseIdentifier = "CS-123";
        this.isLoaner = true;
        this.caseType = "Standard";
        this.surgeryDate = "2023-10-11 18:00";
        this.salesRepId = 5552;
        this.coverageRepId = 15237;
        this.physicianId = 65115;
        this.hospitalId = 12772;
        this.procedureId = 960;
        this.specialInstructions = "Please handle it carefully";
        this.caseNotes = CaseNote.createDummyNotes(1);
        this.patientGender = "Male";
        this.patientAge = 40;
        this.revisionSurgery = true;
        this.revisionReasonId = 1;
        this.usePhysicianPref = false;
        this.userName = "Xuan";
        this.shippingInstructions = new ShippingInstruction[1];
        this.shippingInstructions[0] = new ShippingInstruction(20505, 1628570598, "Attention field", "2023-10-11T13:15:30Z");
        this.productSystems = new ProductSystem[1];
        this.productSystems[0] = new ProductSystem(40456, "Attention field");
    }
}