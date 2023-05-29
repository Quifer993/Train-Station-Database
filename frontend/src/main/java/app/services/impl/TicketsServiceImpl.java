package app.services.impl;

import app.model.Tickets;
import app.services.TicketsService;
import app.services.impl.api.TicketsServiceApi;

public class TicketsServiceImpl
        extends AbstractCrudServiceImpl<Tickets>
        implements TicketsService {

    public TicketsServiceImpl(String baseUrl) {
        super(TicketsServiceApi.class, Tickets.class, baseUrl, "tickets");
    }
}
