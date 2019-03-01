package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStore
  extends senchaUnderscoreTouchLib.ExtNs.IEvented {
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added.
  		*/
  var add: js.UndefOr[
    js.Function1[/* model */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.Array]
  ] = js.undefined
  /** [Method] Uses the configured reader to convert the data into records and adds it to the Store
  		* @param data Object[] Array of data to load
  		*/
  var addData: js.UndefOr[
    js.Function1[/* data */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] We are using applyData so that we can return nothing and prevent the this data property to be overridden
  		* @param data Array/Object
  		*/
  var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Gets the average value in the store
  		* @param field String The field in each record you want to get the average for.
  		* @returns Number The average value, if no items exist, 0.
  		*/
  var average: js.UndefOr[js.Function1[/* field */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var buffered: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Reverts to a view of the Record cache with no filtering applied
  		* @param suppressEvent Boolean true to clear silently without firing the refresh event.
  		*/
  var clearFilter: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var clearOnPageLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Number) */
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object[]/Ext.data.Model[]) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var destroyRemovedRecords: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Calls the specified function for each of the Records in the cache
  		* @param fn Function The function to call. Returning false aborts and exits the iteration.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Record in the iteration.
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Object[]/Ext.util.Collection) */
  var fields: js.UndefOr[js.Any] = js.undefined
  /** [Method] Filters the loaded set of records by a given set of filters
  		* @param filters Object[]/Ext.util.Filter[]/String The set of filters to apply to the data. These are stored internally on the store, but the filtering itself is done on the Store's MixedCollection. See MixedCollection's filter method for filter syntax. Alternatively, pass in a property string.
  		* @param value String value to filter by (only if using a property string as the first argument).
  		* @param anyMatch Boolean true to allow any match, false to anchor regex beginning with ^.
  		* @param caseSensitive Boolean true to make the filtering regex case sensitive.
  		*/
  var filter: js.UndefOr[
    js.Function4[
      /* filters */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Filter by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		*/
  var filterBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Object[]) */
  var filters: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at.
  		* @param anyMatch Boolean true to match any part of the string, not just the beginning.
  		* @param caseSensitive Boolean true for case sensitive comparison.
  		* @param exactMatch Boolean true to force exact match (^ and $ characters added to the regex).
  		* @returns Number The matched index or -1
  		*/
  var find: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Find the index of the first matching Record in this Store by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		* @param startIndex Number The index to start searching at.
  		* @returns Number The matched index or -1.
  		*/
  var findBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value Object The value to match the field against.
  		* @param startIndex Number The index to start searching at.
  		* @returns Number The matched index or -1.
  		*/
  var findExact: js.UndefOr[
    js.Function3[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Finds the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at.
  		* @param anyMatch Boolean true to match any part of the string, not just the beginning.
  		* @param caseSensitive Boolean true for case sensitive comparison.
  		* @param exactMatch Boolean true to force exact match (^ and $ characters added to the regex).
  		* @returns Ext.data.Model The matched record or null.
  		*/
  var findRecord: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      IModel
    ]
  ] = js.undefined
  /** [Method] Convenience function for getting the first model instance in the store
  		* @returns Ext.data.Model/undefined The first model instance in the store, or undefined.
  		*/
  var first: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the number of all cached records including the ones currently filtered
  		* @returns Number The number of all Records in the Store's cache.
  		*/
  var getAllCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get the Record at the specified index
  		* @param index Number The index of the Record to find.
  		* @returns Ext.data.Model/undefined The Record at the passed index. Returns undefined if not found.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Returns the value of autoLoad
  		* @returns Boolean/Object
  		*/
  var getAutoLoad: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of autoSync
  		* @returns Boolean
  		*/
  var getAutoSync: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of buffered
  		* @returns Boolean
  		*/
  var getBuffered: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Get the Record with the specified id
  		* @param id String The id of the Record to find.
  		* @returns Ext.data.Model/undefined The Record with the passed id. Returns undefined if not found.
  		*/
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns the value of clearOnPageLoad
  		* @returns Boolean
  		*/
  var getClearOnPageLoad: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Gets the number of cached records
  		* @returns Number The number of Records in the Store's cache.
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object[]/Ext.data.Model[]
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of destroyRemovedRecords
  		* @returns Boolean
  		*/
  var getDestroyRemovedRecords: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of fields
  		* @returns Object[]/Ext.util.Collection
  		*/
  var getFields: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of getGroupString
  		* @returns Function
  		*/
  var getGetGroupString: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of groupDir
  		* @returns String
  		*/
  var getGroupDir: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of groupField
  		* @returns String
  		*/
  var getGroupField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Function) */
  var getGroupString: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of grouper
  		* @returns Object
  		*/
  var getGrouper: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an array containing the result of applying the grouper to the records in this store
  		* @param groupName String Pass in an optional groupName argument to access a specific group as defined by grouper.
  		* @returns Object/Object[] The grouped data.
  		*/
  var getGroups: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns the value of model
  		* @returns String
  		*/
  var getModel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of modelDefaults
  		* @returns Object
  		*/
  var getModelDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns all Model instances that are either currently a phantom e g
  		* @returns Ext.data.Model[] The Model instances.
  		*/
  var getNewRecords: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of pageSize
  		* @returns Number
  		*/
  var getPageSize: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of plugins
  		* @returns Object/Array
  		*/
  var getPlugins: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of proxy
  		* @returns String/Ext.data.proxy.Proxy/Object
  		*/
  var getProxy: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns a range of Records between specified indices
  		* @param startIndex Number The starting index.
  		* @param endIndex Number The ending index (defaults to the last Record in the Store).
  		* @returns Ext.data.Model[] An array of Records.
  		*/
  var getRange: js.UndefOr[
    js.Function2[
      /* startIndex */ js.UndefOr[scala.Double], 
      /* endIndex */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns the value of remoteFilter
  		* @returns Boolean
  		*/
  var getRemoteFilter: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of remoteGroup
  		* @returns Boolean
  		*/
  var getRemoteGroup: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of remoteSort
  		* @returns Boolean
  		*/
  var getRemoteSort: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns any records that have been removed from the store but not yet destroyed on the proxy
  		* @returns Ext.data.Model[] The removed Model instances.
  		*/
  var getRemovedRecords: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of storeId
  		* @returns String
  		*/
  var getStoreId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of syncRemovedRecords
  		* @returns Boolean
  		*/
  var getSyncRemovedRecords: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of totalCount
  		* @returns Number
  		*/
  var getTotalCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns all Model instances that have been updated in the Store but not yet synchronized with the Proxy
  		* @returns Ext.data.Model[] The updated Model instances.
  		*/
  var getUpdatedRecords: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Config Option] (String) */
  var groupDir: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var groupField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var grouper: js.UndefOr[js.Any] = js.undefined
  /** [Method] Get the index within the cache of the passed Record
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], scala.Double]] = js.undefined
  /** [Method] Get the index within the cache of the Record with the passed id
  		* @param id String The id of the Record to find.
  		* @returns Number The index of the Record. Returns -1 if not found.
  		*/
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Method] Inserts Model instances into the Store at the given index and fires the add event
  		* @param index Number The start index at which to insert the passed Records.
  		* @param records Ext.data.Model[] An Array of Ext.data.Model objects to add to the cache.
  		* @returns Object
  		*/
  var insert: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* records */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns true if the Store is set to autoLoad or is a type which loads upon instantiation
  		* @returns Boolean
  		*/
  var isAutoLoading: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this store is currently filtered
  		* @returns Boolean
  		*/
  var isFiltered: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] This method tells you if this store has a grouper defined on it
  		* @returns Boolean true if this store has a grouper defined.
  		*/
  var isGrouped: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the Store has been loaded
  		* @returns Boolean true if the Store has been loaded.
  		*/
  var isLoaded: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the Store is currently performing a load operation
  		* @returns Boolean true if the Store is currently loading.
  		*/
  var isLoading: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this store is currently sorted
  		* @returns Boolean
  		*/
  var isSorted: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Convenience function for getting the last model instance in the store
  		* @returns Ext.data.Model/undefined The last model instance in the store, or undefined.
  		*/
  var last: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Loads data into the Store via the configured proxy
  		* @param options Object/Function config object, passed into the Ext.data.Operation object before loading.
  		* @param scope Object Scope for the function.
  		* @returns Object
  		*/
  var load: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Loads an array of data straight into the Store
  		* @param data Ext.data.Model[]/Object[] Array of data to load. Any non-model instances will be cast into model instances first.
  		* @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
  		*/
  var loadData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] Loads a given page of data by setting the start and limit values appropriately
  		* @param page Number The number of the page to load.
  		* @param options Object See options for load.
  		* @param scope Object
  		*/
  var loadPage: js.UndefOr[
    js.Function3[
      /* page */ js.UndefOr[scala.Double], 
      /* options */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added.
  		*/
  var loadRecords: js.UndefOr[
    js.Function1[/* model */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.Array]
  ] = js.undefined
  /** [Method] Gets the maximum value in the store
  		* @param field String The field in each record.
  		* @returns Object/undefined The maximum value, if no items exist, undefined.
  		*/
  var max: js.UndefOr[js.Function1[/* field */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Gets the minimum value in the store
  		* @param field String The field in each record.
  		* @returns Object/undefined The minimum value, if no items exist, undefined.
  		*/
  var min: js.UndefOr[js.Function1[/* field */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Config Option] (String) */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Loads the next page in the current data set
  		* @param options Object See options for load.
  		*/
  var nextPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/Array) */
  var plugins: js.UndefOr[js.Any] = js.undefined
  /** [Method] Loads the previous page in the current data set
  		* @param options Object See options for load.
  		*/
  var previousPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String/Ext.data.proxy.Proxy/Object) */
  var proxy: js.UndefOr[js.Any] = js.undefined
  /** [Method] Query the cached records in this Store using a filtering function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		* @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records.
  		*/
  var queryBy: js.UndefOr[
    js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteGroup: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteSort: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Removes the given record from the Store firing the removerecords event passing all the instances that are removed
  		* @param records Ext.data.Model/Ext.data.Model[] Model instance or array of instances to remove.
  		*/
  var remove: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Remove all items from the store
  		* @param silent Boolean Prevent the clear event from being fired.
  		*/
  var removeAll: js.UndefOr[js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Removes the model instance at the given index
  		* @param index Number The record index.
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoLoad
  		* @param autoLoad Boolean/Object The new value.
  		*/
  var setAutoLoad: js.UndefOr[js.Function1[/* autoLoad */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoSync
  		* @param autoSync Boolean The new value.
  		*/
  var setAutoSync: js.UndefOr[js.Function1[/* autoSync */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of buffered
  		* @param buffered Boolean The new value.
  		*/
  var setBuffered: js.UndefOr[js.Function1[/* buffered */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of clearOnPageLoad
  		* @param clearOnPageLoad Boolean The new value.
  		*/
  var setClearOnPageLoad: js.UndefOr[js.Function1[/* clearOnPageLoad */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object[]/Ext.data.Model[] The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of destroyRemovedRecords
  		* @param destroyRemovedRecords Boolean The new value.
  		*/
  var setDestroyRemovedRecords: js.UndefOr[js.Function1[/* destroyRemovedRecords */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of fields
  		* @param fields Object[]/Ext.util.Collection The new value.
  		* @returns Object Ext.util.Collection
  		*/
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of filters
  		* @param filters Object[] The new value.
  		*/
  var setFilters: js.UndefOr[
    js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of getGroupString
  		* @param getGroupString Function The new value.
  		*/
  var setGetGroupString: js.UndefOr[js.Function1[/* getGroupString */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of groupDir
  		* @param groupDir String The new value.
  		*/
  var setGroupDir: js.UndefOr[js.Function1[/* groupDir */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of groupField
  		* @param groupField String The new value.
  		*/
  var setGroupField: js.UndefOr[js.Function1[/* groupField */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of grouper
  		* @param grouper Object The new value.
  		*/
  var setGrouper: js.UndefOr[js.Function1[/* grouper */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of model
  		* @param model String The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of modelDefaults
  		* @param modelDefaults Object The new value.
  		*/
  var setModelDefaults: js.UndefOr[js.Function1[/* modelDefaults */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pageSize
  		* @param pageSize Number The new value.
  		*/
  var setPageSize: js.UndefOr[js.Function1[/* pageSize */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of plugins
  		* @param plugins Object/Array The new value.
  		*/
  var setPlugins: js.UndefOr[js.Function1[/* plugins */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of proxy
  		* @param proxy String/Ext.data.proxy.Proxy/Object The new value.
  		*/
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of remoteFilter
  		* @param remoteFilter Boolean The new value.
  		*/
  var setRemoteFilter: js.UndefOr[js.Function1[/* remoteFilter */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of remoteGroup
  		* @param remoteGroup Boolean The new value.
  		*/
  var setRemoteGroup: js.UndefOr[js.Function1[/* remoteGroup */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of remoteSort
  		* @param remoteSort Boolean The new value.
  		*/
  var setRemoteSort: js.UndefOr[js.Function1[/* remoteSort */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of sorters
  		* @param sorters Object[] The new value.
  		*/
  var setSorters: js.UndefOr[
    js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of storeId
  		* @param storeId String The new value.
  		*/
  var setStoreId: js.UndefOr[js.Function1[/* storeId */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of syncRemovedRecords
  		* @param syncRemovedRecords Boolean The new value.
  		*/
  var setSyncRemovedRecords: js.UndefOr[js.Function1[/* syncRemovedRecords */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of totalCount
  		* @param totalCount Number The new value.
  		*/
  var setTotalCount: js.UndefOr[js.Function1[/* totalCount */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param defaultDirection String The default overall direction to sort the data by.
  		* @param where String This can be either 'prepend' or 'append'. If you leave this undefined it will clear the current sorters.
  		*/
  var sort: js.UndefOr[
    js.Function3[
      /* sorters */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      /* where */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object[]) */
  var sorters: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (String) */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sums the value of property for each record between start and end and returns the result
  		* @param field String The field in each record.
  		* @returns Number The sum.
  		*/
  var sum: js.UndefOr[js.Function1[/* field */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Method] Synchronizes the Store with its Proxy
  		* @param options Object
  		* @returns Object
  		*/
  var sync: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var syncRemovedRecords: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var totalCount: js.UndefOr[scala.Double] = js.undefined
}

object IStore {
  @scala.inline
  def apply(
    IEvented: senchaUnderscoreTouchLib.ExtNs.IEvented = null,
    add: js.Function1[/* model */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.Array] = null,
    addData: js.Function1[/* data */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    applyData: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit] = null,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[scala.Boolean] = js.undefined,
    average: js.Function1[/* field */ js.UndefOr[java.lang.String], scala.Double] = null,
    buffered: js.UndefOr[scala.Boolean] = js.undefined,
    clearFilter: js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    clearOnPageLoad: js.UndefOr[scala.Boolean] = js.undefined,
    currentPage: scala.Int | scala.Double = null,
    data: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    destroyRemovedRecords: js.UndefOr[scala.Boolean] = js.undefined,
    each: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    fields: js.Any = null,
    filter: js.Function4[
      /* filters */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    filterBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    filters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    find: js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      scala.Double
    ] = null,
    findBy: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    findExact: js.Function3[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    findRecord: js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      IModel
    ] = null,
    first: js.Function0[_] = null,
    getAllCount: js.Function0[scala.Double] = null,
    getAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    getAutoLoad: js.Function0[_] = null,
    getAutoSync: js.Function0[scala.Boolean] = null,
    getBuffered: js.Function0[scala.Boolean] = null,
    getById: js.Function1[/* id */ js.UndefOr[java.lang.String], _] = null,
    getClearOnPageLoad: js.Function0[scala.Boolean] = null,
    getCount: js.Function0[scala.Double] = null,
    getData: js.Function0[_] = null,
    getDestroyRemovedRecords: js.Function0[scala.Boolean] = null,
    getFields: js.Function0[_] = null,
    getGetGroupString: js.Function0[_] = null,
    getGroupDir: js.Function0[java.lang.String] = null,
    getGroupField: js.Function0[java.lang.String] = null,
    getGroupString: js.Any = null,
    getGrouper: js.Function0[_] = null,
    getGroups: js.Function1[/* groupName */ js.UndefOr[java.lang.String], _] = null,
    getModel: js.Function0[java.lang.String] = null,
    getModelDefaults: js.Function0[_] = null,
    getNewRecords: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getPageSize: js.Function0[scala.Double] = null,
    getParams: js.Function0[_] = null,
    getPlugins: js.Function0[_] = null,
    getProxy: js.Function0[_] = null,
    getRange: js.Function2[
      /* startIndex */ js.UndefOr[scala.Double], 
      /* endIndex */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    getRemoteFilter: js.Function0[scala.Boolean] = null,
    getRemoteGroup: js.Function0[scala.Boolean] = null,
    getRemoteSort: js.Function0[scala.Boolean] = null,
    getRemovedRecords: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getStoreId: js.Function0[java.lang.String] = null,
    getSyncRemovedRecords: js.Function0[scala.Boolean] = null,
    getTotalCount: js.Function0[scala.Double] = null,
    getUpdatedRecords: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    groupDir: java.lang.String = null,
    groupField: java.lang.String = null,
    grouper: js.Any = null,
    indexOf: js.Function1[/* record */ js.UndefOr[IModel], scala.Double] = null,
    indexOfId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Double] = null,
    insert: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* records */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      _
    ] = null,
    isAutoLoading: js.Function0[scala.Boolean] = null,
    isFiltered: js.Function0[scala.Boolean] = null,
    isGrouped: js.Function0[scala.Boolean] = null,
    isLoaded: js.Function0[scala.Boolean] = null,
    isLoading: js.Function0[scala.Boolean] = null,
    isSorted: js.Function0[scala.Boolean] = null,
    last: js.Function0[_] = null,
    load: js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _] = null,
    loadData: js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    loadPage: js.Function3[
      /* page */ js.UndefOr[scala.Double], 
      /* options */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    loadRecords: js.Function1[/* model */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.Array] = null,
    max: js.Function1[/* field */ js.UndefOr[java.lang.String], _] = null,
    min: js.Function1[/* field */ js.UndefOr[java.lang.String], _] = null,
    model: java.lang.String = null,
    nextPage: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    pageSize: scala.Int | scala.Double = null,
    params: js.Any = null,
    plugins: js.Any = null,
    previousPage: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    proxy: js.Any = null,
    queryBy: js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection
    ] = null,
    remoteFilter: js.UndefOr[scala.Boolean] = js.undefined,
    remoteGroup: js.UndefOr[scala.Boolean] = js.undefined,
    remoteSort: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.Function1[/* records */ js.UndefOr[js.Any], scala.Unit] = null,
    removeAll: js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    removeAt: js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit] = null,
    setAutoLoad: js.Function1[/* autoLoad */ js.UndefOr[js.Any], scala.Unit] = null,
    setAutoSync: js.Function1[/* autoSync */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setBuffered: js.Function1[/* buffered */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setClearOnPageLoad: js.Function1[/* clearOnPageLoad */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setData: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit] = null,
    setDestroyRemovedRecords: js.Function1[/* destroyRemovedRecords */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setFields: js.Function1[/* fields */ js.UndefOr[js.Any], _] = null,
    setFilters: js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setGetGroupString: js.Function1[/* getGroupString */ js.UndefOr[js.Any], scala.Unit] = null,
    setGroupDir: js.Function1[/* groupDir */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setGroupField: js.Function1[/* groupField */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setGrouper: js.Function1[/* grouper */ js.UndefOr[js.Any], scala.Unit] = null,
    setModel: js.Function1[/* model */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setModelDefaults: js.Function1[/* modelDefaults */ js.UndefOr[js.Any], scala.Unit] = null,
    setPageSize: js.Function1[/* pageSize */ js.UndefOr[scala.Double], scala.Unit] = null,
    setParams: js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit] = null,
    setPlugins: js.Function1[/* plugins */ js.UndefOr[js.Any], scala.Unit] = null,
    setProxy: js.Function1[/* proxy */ js.UndefOr[js.Any], scala.Unit] = null,
    setRemoteFilter: js.Function1[/* remoteFilter */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setRemoteGroup: js.Function1[/* remoteGroup */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setRemoteSort: js.Function1[/* remoteSort */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setSorters: js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setStoreId: js.Function1[/* storeId */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSyncRemovedRecords: js.Function1[/* syncRemovedRecords */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setTotalCount: js.Function1[/* totalCount */ js.UndefOr[scala.Double], scala.Unit] = null,
    sort: js.Function3[
      /* sorters */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      /* where */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    sorters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    storeId: java.lang.String = null,
    sum: js.Function1[/* field */ js.UndefOr[java.lang.String], scala.Double] = null,
    sync: js.Function1[/* options */ js.UndefOr[js.Any], _] = null,
    syncRemovedRecords: js.UndefOr[scala.Boolean] = js.undefined,
    totalCount: scala.Int | scala.Double = null
  ): IStore = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IEvented)
    if (add != null) __obj.updateDynamic("add")(add)
    if (addData != null) __obj.updateDynamic("addData")(addData)
    if (applyData != null) __obj.updateDynamic("applyData")(applyData)
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (average != null) __obj.updateDynamic("average")(average)
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered)
    if (clearFilter != null) __obj.updateDynamic("clearFilter")(clearFilter)
    if (!js.isUndefined(clearOnPageLoad)) __obj.updateDynamic("clearOnPageLoad")(clearOnPageLoad)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(destroyRemovedRecords)) __obj.updateDynamic("destroyRemovedRecords")(destroyRemovedRecords)
    if (each != null) __obj.updateDynamic("each")(each)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (find != null) __obj.updateDynamic("find")(find)
    if (findBy != null) __obj.updateDynamic("findBy")(findBy)
    if (findExact != null) __obj.updateDynamic("findExact")(findExact)
    if (findRecord != null) __obj.updateDynamic("findRecord")(findRecord)
    if (first != null) __obj.updateDynamic("first")(first)
    if (getAllCount != null) __obj.updateDynamic("getAllCount")(getAllCount)
    if (getAt != null) __obj.updateDynamic("getAt")(getAt)
    if (getAutoLoad != null) __obj.updateDynamic("getAutoLoad")(getAutoLoad)
    if (getAutoSync != null) __obj.updateDynamic("getAutoSync")(getAutoSync)
    if (getBuffered != null) __obj.updateDynamic("getBuffered")(getBuffered)
    if (getById != null) __obj.updateDynamic("getById")(getById)
    if (getClearOnPageLoad != null) __obj.updateDynamic("getClearOnPageLoad")(getClearOnPageLoad)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getData != null) __obj.updateDynamic("getData")(getData)
    if (getDestroyRemovedRecords != null) __obj.updateDynamic("getDestroyRemovedRecords")(getDestroyRemovedRecords)
    if (getFields != null) __obj.updateDynamic("getFields")(getFields)
    if (getGetGroupString != null) __obj.updateDynamic("getGetGroupString")(getGetGroupString)
    if (getGroupDir != null) __obj.updateDynamic("getGroupDir")(getGroupDir)
    if (getGroupField != null) __obj.updateDynamic("getGroupField")(getGroupField)
    if (getGroupString != null) __obj.updateDynamic("getGroupString")(getGroupString)
    if (getGrouper != null) __obj.updateDynamic("getGrouper")(getGrouper)
    if (getGroups != null) __obj.updateDynamic("getGroups")(getGroups)
    if (getModel != null) __obj.updateDynamic("getModel")(getModel)
    if (getModelDefaults != null) __obj.updateDynamic("getModelDefaults")(getModelDefaults)
    if (getNewRecords != null) __obj.updateDynamic("getNewRecords")(getNewRecords)
    if (getPageSize != null) __obj.updateDynamic("getPageSize")(getPageSize)
    if (getParams != null) __obj.updateDynamic("getParams")(getParams)
    if (getPlugins != null) __obj.updateDynamic("getPlugins")(getPlugins)
    if (getProxy != null) __obj.updateDynamic("getProxy")(getProxy)
    if (getRange != null) __obj.updateDynamic("getRange")(getRange)
    if (getRemoteFilter != null) __obj.updateDynamic("getRemoteFilter")(getRemoteFilter)
    if (getRemoteGroup != null) __obj.updateDynamic("getRemoteGroup")(getRemoteGroup)
    if (getRemoteSort != null) __obj.updateDynamic("getRemoteSort")(getRemoteSort)
    if (getRemovedRecords != null) __obj.updateDynamic("getRemovedRecords")(getRemovedRecords)
    if (getStoreId != null) __obj.updateDynamic("getStoreId")(getStoreId)
    if (getSyncRemovedRecords != null) __obj.updateDynamic("getSyncRemovedRecords")(getSyncRemovedRecords)
    if (getTotalCount != null) __obj.updateDynamic("getTotalCount")(getTotalCount)
    if (getUpdatedRecords != null) __obj.updateDynamic("getUpdatedRecords")(getUpdatedRecords)
    if (groupDir != null) __obj.updateDynamic("groupDir")(groupDir)
    if (groupField != null) __obj.updateDynamic("groupField")(groupField)
    if (grouper != null) __obj.updateDynamic("grouper")(grouper)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(indexOfId)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (isAutoLoading != null) __obj.updateDynamic("isAutoLoading")(isAutoLoading)
    if (isFiltered != null) __obj.updateDynamic("isFiltered")(isFiltered)
    if (isGrouped != null) __obj.updateDynamic("isGrouped")(isGrouped)
    if (isLoaded != null) __obj.updateDynamic("isLoaded")(isLoaded)
    if (isLoading != null) __obj.updateDynamic("isLoading")(isLoading)
    if (isSorted != null) __obj.updateDynamic("isSorted")(isSorted)
    if (last != null) __obj.updateDynamic("last")(last)
    if (load != null) __obj.updateDynamic("load")(load)
    if (loadData != null) __obj.updateDynamic("loadData")(loadData)
    if (loadPage != null) __obj.updateDynamic("loadPage")(loadPage)
    if (loadRecords != null) __obj.updateDynamic("loadRecords")(loadRecords)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (model != null) __obj.updateDynamic("model")(model)
    if (nextPage != null) __obj.updateDynamic("nextPage")(nextPage)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (previousPage != null) __obj.updateDynamic("previousPage")(previousPage)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (queryBy != null) __obj.updateDynamic("queryBy")(queryBy)
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter)
    if (!js.isUndefined(remoteGroup)) __obj.updateDynamic("remoteGroup")(remoteGroup)
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (removeAt != null) __obj.updateDynamic("removeAt")(removeAt)
    if (setAutoLoad != null) __obj.updateDynamic("setAutoLoad")(setAutoLoad)
    if (setAutoSync != null) __obj.updateDynamic("setAutoSync")(setAutoSync)
    if (setBuffered != null) __obj.updateDynamic("setBuffered")(setBuffered)
    if (setClearOnPageLoad != null) __obj.updateDynamic("setClearOnPageLoad")(setClearOnPageLoad)
    if (setData != null) __obj.updateDynamic("setData")(setData)
    if (setDestroyRemovedRecords != null) __obj.updateDynamic("setDestroyRemovedRecords")(setDestroyRemovedRecords)
    if (setFields != null) __obj.updateDynamic("setFields")(setFields)
    if (setFilters != null) __obj.updateDynamic("setFilters")(setFilters)
    if (setGetGroupString != null) __obj.updateDynamic("setGetGroupString")(setGetGroupString)
    if (setGroupDir != null) __obj.updateDynamic("setGroupDir")(setGroupDir)
    if (setGroupField != null) __obj.updateDynamic("setGroupField")(setGroupField)
    if (setGrouper != null) __obj.updateDynamic("setGrouper")(setGrouper)
    if (setModel != null) __obj.updateDynamic("setModel")(setModel)
    if (setModelDefaults != null) __obj.updateDynamic("setModelDefaults")(setModelDefaults)
    if (setPageSize != null) __obj.updateDynamic("setPageSize")(setPageSize)
    if (setParams != null) __obj.updateDynamic("setParams")(setParams)
    if (setPlugins != null) __obj.updateDynamic("setPlugins")(setPlugins)
    if (setProxy != null) __obj.updateDynamic("setProxy")(setProxy)
    if (setRemoteFilter != null) __obj.updateDynamic("setRemoteFilter")(setRemoteFilter)
    if (setRemoteGroup != null) __obj.updateDynamic("setRemoteGroup")(setRemoteGroup)
    if (setRemoteSort != null) __obj.updateDynamic("setRemoteSort")(setRemoteSort)
    if (setSorters != null) __obj.updateDynamic("setSorters")(setSorters)
    if (setStoreId != null) __obj.updateDynamic("setStoreId")(setStoreId)
    if (setSyncRemovedRecords != null) __obj.updateDynamic("setSyncRemovedRecords")(setSyncRemovedRecords)
    if (setTotalCount != null) __obj.updateDynamic("setTotalCount")(setTotalCount)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (sum != null) __obj.updateDynamic("sum")(sum)
    if (sync != null) __obj.updateDynamic("sync")(sync)
    if (!js.isUndefined(syncRemovedRecords)) __obj.updateDynamic("syncRemovedRecords")(syncRemovedRecords)
    if (totalCount != null) __obj.updateDynamic("totalCount")(totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStore]
  }
}

