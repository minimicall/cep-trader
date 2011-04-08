// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceLocatorInterface.vsl in andromda-spring-cartridge.
//
package com.algoTrader;

/**
 * Locates and provides all available application services.
 */
public interface CommonServiceLocator
{

    /**
     * Initializes the Spring application context from
     * the given <code>beanFactoryReferenceLocation</code>.  If <code>null</code>
     * is specified for the <code>beanFactoryReferenceLocation</code>
     * then the default application context will be used.
     *
     * @param beanFactoryReferenceLocation the location of the beanRefFactory reference.
     */
    public void init(final String beanFactoryReferenceLocation);
	

    /**
     * Shuts down the ServiceLocator and releases any used resources.
     */
    public void shutdown();	

    /**
     * Gets an instance of {@link com.algoTrader.service.RuleService}.
     */
    public com.algoTrader.service.RuleService getRuleService();

    /**
     * Gets an instance of {@link com.algoTrader.service.TickService}.
     */
    public com.algoTrader.service.TickService getTickService();

    /**
     * Gets an instance of {@link com.algoTrader.service.TransactionService}.
     */
    public com.algoTrader.service.TransactionService getTransactionService();

    /**
     * Gets an instance of {@link com.algoTrader.service.LookupService}.
     */
    public com.algoTrader.service.LookupService getLookupService();

    /**
     * Gets an instance of {@link com.algoTrader.service.PositionService}.
     */
    public com.algoTrader.service.PositionService getPositionService();


    /**
     * Gets an instance of the given service.
     */
    public Object getService(String serviceName);

}