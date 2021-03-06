package data;

import business.identification.entity.Identification;
import play.data.validation.Constraints;

/**
 * @author: hardik
 * @since: 10/8/15
 */
public class IdentificationTO {

    @Constraints.Required
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private Long time;

    @Constraints.Required
    private Long waitingTime;

    @Constraints.Required
    private Long companyId;

    public static IdentificationTO fromBO( Identification identification) {

        IdentificationTO to = new IdentificationTO ();

        to.setCompanyId (identification.getCompany ().getId ());
        to.setId (identification.getId ());
        to.setName (identification.getName ());
        to.setTime (identification.getTime ());
        to.setWaitingTime (identification.getWaitingTime ());
        return to;
    }

    public Long getId () {

        return id;
    }

    public void setId ( Long id ) {

        this.id = id;
    }

    public String getName () {

        return name;
    }

    public void setName ( String name ) {

        this.name = name;
    }

    public Long getTime () {

        return time;
    }

    public void setTime ( Long time ) {

        this.time = time;
    }

    public Long getWaitingTime () {

        return waitingTime;
    }

    public void setWaitingTime ( Long waitingTime ) {

        this.waitingTime = waitingTime;
    }

    public Long getCompanyId () {

        return companyId;
    }

    public void setCompanyId ( Long companyId ) {

        this.companyId = companyId;
    }
}
