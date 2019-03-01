package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a service for composing a single select statement.
  *
  * It hides the complexity of parsing and evaluating a single select statement and provides sophisticated methods for expanding a statement with filter,
  * group by, having and order criteria. To get the new extended statement use the methods from {@link com.sun.star.sdb.SingleSelectQueryAnalyzer} .
  *
  * A {@link SingleSelectQueryComposer} is usually obtained from a {@link Connection} using the {@link com.sun.star.lang.XMultiServiceFactory} interface.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSingleSelectQueryComposer because var conflicts: Query. Inlined appendFilterByColumn, appendGroupByColumn, appendHavingClauseByColumn, appendOrderByColumn, ElementaryQuery, setFilter, setGroup, setHavingClause, setOrder, setStructuredFilter, setStructuredHavingClause */ trait SingleSelectQueryComposer
  extends SingleSelectQueryAnalyzer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * sets a new elementary query for the composer
    *
    * An elementary query or statement is a (single select) statement whose parts are not covered by the various set and get methods of the composer. That
    * is, if the elementary statement contains a filter clause, a call to {@link XSingleSelectQueryAnalyzer.getFilter()} will not return you this filter.
    * Instead, only filters which have been set using for instance {@link setFilter()} are covered by the get methods.
    *
    * The only methods which take all parts of the elementary statement into account are {@link XSingleSelectQueryAnalyzer.getQuery()} and {@link
    * XSingleSelectQueryAnalyzer.getQueryWithSubstitution()} , which always returns the complete composed query.
    *
    * As a result, you can use the composer to build cumulative filter expressions. That is, you can set {@link ElementaryQuery} to a statement already
    * containing filters, and then use {@link setFilter()} to append additional filters.
    *
    * The very same holds for sort orders, `HAVING` and `GROUP BY` clauses.
    *
    * There are various use cases for this. For instance, you might want to use the statement represented by a {@link QueryDefinition} , and extend it with
    * additional filters or sort orders, while not touching the respective parts already present in QueryDefinition::Command. This can be achieved by
    * setting the QueryDefinition::Command as {@link ElementaryQuery} of a {@link SingleSelectQueryComposer} .
    *
    * If, in such a scenario, you would be interested in the filter part of the QueryDefinition::Command, you would set it via {@link
    * XSingleSelectQueryAnalyzer.setQuery()} , and retrieve the filter part via {@link XSingleSelectQueryAnalyzer.getFilter()} .
    *
    * If you'd be interested in the composed filter, you would set the QueryDefinition::Command as {@link ElementaryQuery} , add your filter, and propagate
    * the resulting query ( {@link XSingleSelectQueryAnalyzer.getQuery()} ) to an {@link SingleSelectQueryAnalyzer} instance via {@link
    * XSingleSelectQueryAnalyzer.setQuery()} .
    */
  var ElementaryQuery: java.lang.String
  /** is the original SQL statement set with the interface {@link com.sun.star.sdb.XSingleSelectQueryAnalyzer} . */
  var Original: java.lang.String
  /**
    * appends a new filter condition by a {@link com.sun.star.sdb.DataColumn} providing the name and the value for the filter. The value property must be
    * supported by the {@link com.sun.star.sdb.DataColumn} .
    * @param column the column which is used to create a filter
    * @param andCriteria If `TRUE` the filter condition will be appended as an AND condition, otherwise the new filter condition will be appended as OR criter
    * @param filterOperator The operator used, is defined by {@link com.sun.star.sdb.SQLFilterOperator} .
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendFilterByColumn(
    column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    andCriteria: scala.Boolean,
    filterOperator: scala.Double
  ): scala.Unit
  /**
    * appends an additional part to the group criteria of the select statement. The column must be a {@link com.sun.star.sdbcx.Column} .
    * @param column the column which is used to create a group part
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendGroupByColumn(column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): scala.Unit
  /**
    * appends a new HAVING filter condition by a {@link com.sun.star.sdb.DataColumn} providing the name and the value for the filter.
    * @param column the column which is used to create a filter
    * @param andCriteria If `TRUE` the filter condition will be appended as an AND condition, otherwise the new filter condition will be appended as OR criter
    * @param filterOperator The operator used, is defined by {@link com.sun.star.sdb.SQLFilterOperator} .
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendHavingClauseByColumn(
    column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    andCriteria: scala.Boolean,
    filterOperator: scala.Double
  ): scala.Unit
  /**
    * appends an additional part to the sort order criteria of the select statement. The column must be a {@link com.sun.star.sdbcx.Column} .
    * @param column the column which is used to create a order part
    * @param ascending `TRUE` when the order should be ascending, otherwise if `FALSE` descending.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendOrderByColumn(
    column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ascending: scala.Boolean
  ): scala.Unit
  /**
    * makes it possible to set a filter condition for the query.
    * @param filter the filter to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't valid or the statement isn't parsable.
    */
  def setFilter(filter: java.lang.String): scala.Unit
  /**
    * makes it possible to set a group for the query.
    * @param group the group part to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't valid or the statement isn't parsable.
    */
  def setGroup(group: java.lang.String): scala.Unit
  /**
    * makes it possible to set a HAVING filter condition for the query.
    * @param filter the filter to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't valid or the statement isn't parsable.
    */
  def setHavingClause(filter: java.lang.String): scala.Unit
  /**
    * makes it possible to set a sort condition for the query.
    * @param order the order part to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the order isn't valid or the statement isn't parsable.
    */
  def setOrder(order: java.lang.String): scala.Unit
  /**
    * appends a new set of filter criteria which is split into levels.
    * @param filter The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND cri
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setStructuredFilter(
    filter: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ]
  ): scala.Unit
  /**
    * appends a new set of HAVING filter criteria which is split into levels.
    * @param filter The HAVING filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setStructuredHavingClause(
    filter: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ]
  ): scala.Unit
}

object SingleSelectQueryComposer {
  @scala.inline
  def apply(
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    ElementaryQuery: java.lang.String,
    Filter: java.lang.String,
    Group: java.lang.String,
    GroupColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    HavingClause: java.lang.String,
    Order: java.lang.String,
    OrderColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Original: java.lang.String,
    Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Query: java.lang.String,
    QueryWithSubstitution: java.lang.String,
    StructuredFilter: activexDashInteropLib.SafeArray[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    StructuredHavingClause: activexDashInteropLib.SafeArray[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    Tables: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    appendFilterByColumn: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Boolean, 
      scala.Double, 
      scala.Unit
    ],
    appendGroupByColumn: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Unit],
    appendHavingClauseByColumn: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Boolean, 
      scala.Double, 
      scala.Unit
    ],
    appendOrderByColumn: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Boolean, 
      scala.Unit
    ],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getFilter: js.Function0[java.lang.String],
    getGroup: js.Function0[java.lang.String],
    getGroupColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getHavingClause: js.Function0[java.lang.String],
    getOrder: js.Function0[java.lang.String],
    getOrderColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getParameters: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getQuery: js.Function0[java.lang.String],
    getQueryWithSubstitution: js.Function0[java.lang.String],
    getStructuredFilter: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    getStructuredHavingClause: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    getTables: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setCommand: js.Function2[java.lang.String, scala.Double, scala.Unit],
    setFilter: js.Function1[java.lang.String, scala.Unit],
    setGroup: js.Function1[java.lang.String, scala.Unit],
    setHavingClause: js.Function1[java.lang.String, scala.Unit],
    setOrder: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setQuery: js.Function1[java.lang.String, scala.Unit],
    setStructuredFilter: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
        activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ], 
      scala.Unit
    ],
    setStructuredHavingClause: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
        activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ], 
      scala.Unit
    ]
  ): SingleSelectQueryComposer = {
    val __obj = js.Dynamic.literal(Columns = Columns, ElementaryQuery = ElementaryQuery, Filter = Filter, Group = Group, GroupColumns = GroupColumns, HavingClause = HavingClause, Order = Order, OrderColumns = OrderColumns, Original = Original, Parameters = Parameters, PropertySetInfo = PropertySetInfo, Query = Query, QueryWithSubstitution = QueryWithSubstitution, StructuredFilter = StructuredFilter, StructuredHavingClause = StructuredHavingClause, Tables = Tables, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, appendFilterByColumn = appendFilterByColumn, appendGroupByColumn = appendGroupByColumn, appendHavingClauseByColumn = appendHavingClauseByColumn, appendOrderByColumn = appendOrderByColumn, getColumns = getColumns, getFilter = getFilter, getGroup = getGroup, getGroupColumns = getGroupColumns, getHavingClause = getHavingClause, getOrder = getOrder, getOrderColumns = getOrderColumns, getParameters = getParameters, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getQuery = getQuery, getQueryWithSubstitution = getQueryWithSubstitution, getStructuredFilter = getStructuredFilter, getStructuredHavingClause = getStructuredHavingClause, getTables = getTables, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setCommand = setCommand, setFilter = setFilter, setGroup = setGroup, setHavingClause = setHavingClause, setOrder = setOrder, setPropertyValue = setPropertyValue, setQuery = setQuery, setStructuredFilter = setStructuredFilter, setStructuredHavingClause = setStructuredHavingClause)
  
    __obj.asInstanceOf[SingleSelectQueryComposer]
  }
}

