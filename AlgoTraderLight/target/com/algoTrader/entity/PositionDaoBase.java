// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package com.algoTrader.entity;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>com.algoTrader.entity.Position</code>.
 * </p>
 *
 * @see com.algoTrader.entity.Position
 */
public abstract class PositionDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements com.algoTrader.entity.PositionDao
{

    /**
     * @see com.algoTrader.entity.PositionDao#load(int, int)
     */
    public java.lang.Object load(final int transform, final int id)
    {
        final java.lang.Object entity = this.getHibernateTemplate().get(com.algoTrader.entity.PositionImpl.class, new java.lang.Integer(id));
        return transformEntity(transform, (com.algoTrader.entity.Position)entity);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#load(int)
     */
    public com.algoTrader.entity.Position load(int id)
    {
        return (com.algoTrader.entity.Position)this.load(TRANSFORM_NONE, id);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#loadAll()
     */
    public java.util.Collection loadAll()
    {
        return this.loadAll(TRANSFORM_NONE);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#loadAll(int)
     */
    public java.util.Collection loadAll(final int transform)
    {
        final java.util.Collection results = this.getHibernateTemplate().loadAll(com.algoTrader.entity.PositionImpl.class);
        this.transformEntities(transform, results);
        return results;
    }


    /**
     * @see com.algoTrader.entity.PositionDao#create(com.algoTrader.entity.Position)
     */
    public com.algoTrader.entity.Position create(com.algoTrader.entity.Position position)
    {
        return (com.algoTrader.entity.Position)this.create(TRANSFORM_NONE, position);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#create(int transform, com.algoTrader.entity.Position)
     */
    public java.lang.Object create(final int transform, final com.algoTrader.entity.Position position)
    {
        if (position == null)
        {
            throw new IllegalArgumentException(
                "Position.create - 'position' can not be null");
        }
        this.getHibernateTemplate().save(position);
        return this.transformEntity(transform, position);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#create(java.util.Collection)
     */
    public java.util.Collection create(final java.util.Collection entities)
    {
        return create(TRANSFORM_NONE, entities);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#create(int, java.util.Collection)
     */
    public java.util.Collection create(final int transform, final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Position.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        create(transform, (com.algoTrader.entity.Position)entityIterator.next());
                    }
                    return null;
                }
            });
        return entities;
    }

    /**
     * @see com.algoTrader.entity.PositionDao#create(long, java.lang.Double, java.math.BigDecimal)
     */
    public com.algoTrader.entity.Position create(
        long quantity,
        java.lang.Double exitValue,
        java.math.BigDecimal maintenanceMargin)
    {
        return (com.algoTrader.entity.Position)this.create(TRANSFORM_NONE, quantity, exitValue, maintenanceMargin);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#create(int, long, java.lang.Double, java.math.BigDecimal)
     */
    public java.lang.Object create(
        final int transform,
        long quantity,
        java.lang.Double exitValue,
        java.math.BigDecimal maintenanceMargin)
    {
        com.algoTrader.entity.Position entity = new com.algoTrader.entity.PositionImpl();
        entity.setQuantity(quantity);
        entity.setExitValue(exitValue);
        entity.setMaintenanceMargin(maintenanceMargin);
        return this.create(transform, entity);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#create(long, com.algoTrader.entity.Security, com.algoTrader.entity.Strategy)
     */
    public com.algoTrader.entity.Position create(
        long quantity,
        com.algoTrader.entity.Security security,
        com.algoTrader.entity.Strategy strategy)
    {
        return (com.algoTrader.entity.Position)this.create(TRANSFORM_NONE, quantity, security, strategy);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#create(int, long, com.algoTrader.entity.Security, com.algoTrader.entity.Strategy)
     */
    public java.lang.Object create(
        final int transform,
        long quantity,
        com.algoTrader.entity.Security security,
        com.algoTrader.entity.Strategy strategy)
    {
        com.algoTrader.entity.Position entity = new com.algoTrader.entity.PositionImpl();
        entity.setQuantity(quantity);
        entity.setSecurity(security);
        entity.setStrategy(strategy);
        return this.create(transform, entity);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#update(com.algoTrader.entity.Position)
     */
    public void update(com.algoTrader.entity.Position position)
    {
        if (position == null)
        {
            throw new IllegalArgumentException(
                "Position.update - 'position' can not be null");
        }
        this.getHibernateTemplate().update(position);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#update(java.util.Collection)
     */
    public void update(final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Position.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        update((com.algoTrader.entity.Position)entityIterator.next());
                    }
                    return null;
                }
            });
    }

    /**
     * @see com.algoTrader.entity.PositionDao#remove(com.algoTrader.entity.Position)
     */
    public void remove(com.algoTrader.entity.Position position)
    {
        if (position == null)
        {
            throw new IllegalArgumentException(
                "Position.remove - 'position' can not be null");
        }
        this.getHibernateTemplate().delete(position);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#remove(int)
     */
    public void remove(int id)
    {
        com.algoTrader.entity.Position entity = this.load(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * @see com.algoTrader.entity.PositionDao#remove(java.util.Collection)
     */
    public void remove(java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Position.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }
    /**
     * @see com.algoTrader.entity.PositionDao#findOpenPositions()
     */
    public java.util.List findOpenPositions()
    {
        return this.findOpenPositions(TRANSFORM_NONE);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findOpenPositions(java.lang.String)
     */
    public java.util.List findOpenPositions(final java.lang.String queryString)
    {
        return this.findOpenPositions(TRANSFORM_NONE, queryString);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findOpenPositions(int)
     */
    public java.util.List findOpenPositions(final int transform)
    {
        return this.findOpenPositions(transform, "select p from PositionImpl as p join fetch p.security as s join fetch s.securityFamily as f where p.quantity != 0 order by p.id");
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findOpenPositions(int, java.lang.String)
     */
    public java.util.List findOpenPositions(final int transform, final java.lang.String queryString)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);	
            queryObject.setCacheable(true);
            java.util.List results = queryObject.list();
            transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findOpenPositionsByStrategy(java.lang.String)
     */
    public java.util.List findOpenPositionsByStrategy(java.lang.String strategyName)
    {
        return this.findOpenPositionsByStrategy(TRANSFORM_NONE, strategyName);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findOpenPositionsByStrategy(java.lang.String, java.lang.String)
     */
    public java.util.List findOpenPositionsByStrategy(final java.lang.String queryString, final java.lang.String strategyName)
    {
        return this.findOpenPositionsByStrategy(TRANSFORM_NONE, queryString, strategyName);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findOpenPositionsByStrategy(int, java.lang.String)
     */
    public java.util.List findOpenPositionsByStrategy(final int transform, final java.lang.String strategyName)
    {
        return this.findOpenPositionsByStrategy(transform, "from PositionImpl as p join fetch p.security as s join fetch s.securityFamily as f where p.strategy.name = :strategyName and p.quantity != 0 order by p.id ", strategyName);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findOpenPositionsByStrategy(int, java.lang.String, java.lang.String)
     */
    public java.util.List findOpenPositionsByStrategy(final int transform, final java.lang.String queryString, final java.lang.String strategyName)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);	
            queryObject.setCacheable(true);
            queryObject.setParameter("strategyName", strategyName);
            java.util.List results = queryObject.list();
            transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findByIdFetched(int)
     */
    public com.algoTrader.entity.Position findByIdFetched(int id)
    {
        return (com.algoTrader.entity.Position)this.findByIdFetched(TRANSFORM_NONE, id);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findByIdFetched(java.lang.String, int)
     */
    public com.algoTrader.entity.Position findByIdFetched(final java.lang.String queryString, final int id)
    {
        return (com.algoTrader.entity.Position)this.findByIdFetched(TRANSFORM_NONE, queryString, id);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findByIdFetched(int, int)
     */
    public java.lang.Object findByIdFetched(final int transform, final int id)
    {
        return this.findByIdFetched(transform, "select p from PositionImpl as p join fetch p.security as s join fetch s.securityFamily as f left join fetch s.underlaying as ul left join fetch ul.volatility as v where p.id = :id", id);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findByIdFetched(int, java.lang.String, int)
     */
    public java.lang.Object findByIdFetched(final int transform, final java.lang.String queryString, final int id)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);	
            queryObject.setCacheable(true);
            queryObject.setParameter("id", new java.lang.Integer(id));
            java.util.Set results = new java.util.LinkedHashSet(queryObject.list());
            java.lang.Object result = null;
            if (results != null)
            {
                if (results.size() > 1)
                {
                    throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
                        "More than one instance of 'com.algoTrader.entity.Position"
                            + "' was found when executing query --> '" + queryString + "'");
                }
                else if (results.size() == 1)
                {
                    result = results.iterator().next();
                }
            }
            result = transformEntity(transform, (com.algoTrader.entity.Position)result);
            return result;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findBySecurityAndStrategy(int, java.lang.String)
     */
    public com.algoTrader.entity.Position findBySecurityAndStrategy(int securityId, java.lang.String strategyName)
    {
        return (com.algoTrader.entity.Position)this.findBySecurityAndStrategy(TRANSFORM_NONE, securityId, strategyName);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findBySecurityAndStrategy(java.lang.String, int, java.lang.String)
     */
    public com.algoTrader.entity.Position findBySecurityAndStrategy(final java.lang.String queryString, final int securityId, final java.lang.String strategyName)
    {
        return (com.algoTrader.entity.Position)this.findBySecurityAndStrategy(TRANSFORM_NONE, queryString, securityId, strategyName);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findBySecurityAndStrategy(int, int, java.lang.String)
     */
    public java.lang.Object findBySecurityAndStrategy(final int transform, final int securityId, final java.lang.String strategyName)
    {
        return this.findBySecurityAndStrategy(transform, "from PositionImpl as p join fetch p.security as s join fetch s.securityFamily as f where p.security.id = :securityId and p.strategy.name = :strategyName", securityId, strategyName);
    }

    /**
     * @see com.algoTrader.entity.PositionDao#findBySecurityAndStrategy(int, java.lang.String, int, java.lang.String)
     */
    public java.lang.Object findBySecurityAndStrategy(final int transform, final java.lang.String queryString, final int securityId, final java.lang.String strategyName)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);	
            queryObject.setCacheable(true);
            queryObject.setParameter("securityId", new java.lang.Integer(securityId));
            queryObject.setParameter("strategyName", strategyName);
            java.util.Set results = new java.util.LinkedHashSet(queryObject.list());
            java.lang.Object result = null;
            if (results != null)
            {
                if (results.size() > 1)
                {
                    throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
                        "More than one instance of 'com.algoTrader.entity.Position"
                            + "' was found when executing query --> '" + queryString + "'");
                }
                else if (results.size() == 1)
                {
                    result = results.iterator().next();
                }
            }
            result = transformEntity(transform, (com.algoTrader.entity.Position)result);
            return result;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>com.algoTrader.entity.PositionDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link com.algoTrader.entity.PositionDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,java.util.Collection)
     */
    protected java.lang.Object transformEntity(final int transform, final com.algoTrader.entity.Position entity)
    {
        java.lang.Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_NONE : // fall-through
                default:
                    target = entity;
            }
        }
        return target;
    }

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,com.algoTrader.entity.Position)}
     * method. This method does not instantiate a new collection.
     * <p/>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>com.algoTrader.entity.PositionDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,com.algoTrader.entity.Position)
     */
    protected void transformEntities(final int transform, final java.util.Collection entities)
    {
        switch (transform)
        {
            case TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

}