package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScriptTagProxy
  extends senchaUnderscoreTouchLib.ExtNs.dataNs.proxyNs.IServer {
  /** [Method] Aborts the current server request if one is currently running  */
  var abort: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoAppendParams: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Performs the read request to the remote domain
  		* @param operation Ext.data.Operation The Operation object to execute.
  		* @param callback Function A callback function to execute when the Operation has been completed.
  		* @param scope Object The scope to execute the callback in.
  		* @returns Object
  		*/
  @JSName("doRequest")
  var doRequest_IScriptTagProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of autoAppendParams
  		* @returns Boolean
  		*/
  var getAutoAppendParams: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of callbackKey
  		* @returns String
  		*/
  var getCallbackKey: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of defaultWriterType
  		* @returns String
  		*/
  var getDefaultWriterType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of recordParam
  		* @returns String
  		*/
  var getRecordParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var recordParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of autoAppendParams
  		* @param autoAppendParams Boolean The new value.
  		*/
  var setAutoAppendParams: js.UndefOr[js.Function1[/* autoAppendParams */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of callbackKey
  		* @param callbackKey String The new value.
  		*/
  var setCallbackKey: js.UndefOr[js.Function1[/* callbackKey */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultWriterType
  		* @param defaultWriterType String The new value.
  		*/
  var setDefaultWriterType: js.UndefOr[js.Function1[/* defaultWriterType */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of recordParam
  		* @param recordParam String The new value.
  		*/
  var setRecordParam: js.UndefOr[js.Function1[/* recordParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IScriptTagProxy {
  @scala.inline
  def apply(
    abort: () => scala.Unit = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    afterRequest: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    api: js.Any = null,
    autoAppendParams: js.UndefOr[scala.Boolean] = js.undefined,
    batch: /* options */ js.UndefOr[js.Any] => IBatch = null,
    batchActions: js.UndefOr[scala.Boolean] = js.undefined,
    batchOrder: java.lang.String = null,
    bubbleEvents: js.Any = null,
    buildRequest: /* operation */ js.UndefOr[IOperation] => IRequest = null,
    buildUrl: /* request */ js.UndefOr[IRequest] => java.lang.String = null,
    cacheString: java.lang.String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    callbackKey: java.lang.String = null,
    clearListeners: () => scala.Unit = null,
    config: js.Any = null,
    create: () => scala.Unit = null,
    destroy: () => scala.Unit = null,
    directionParam: java.lang.String = null,
    doRequest: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => scala.Unit = null,
    enablePagingParams: js.UndefOr[scala.Boolean] = js.undefined,
    encodeFilters: /* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => java.lang.String = null,
    encodeSorters: /* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => java.lang.String = null,
    extend: java.lang.String = null,
    extraParams: js.Any = null,
    filterParam: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    getApi: () => _ = null,
    getAutoAppendParams: () => scala.Boolean = null,
    getBatchActions: () => scala.Boolean = null,
    getBatchOrder: () => java.lang.String = null,
    getBubbleEvents: () => _ = null,
    getCacheString: () => java.lang.String = null,
    getCallbackKey: () => java.lang.String = null,
    getDefaultWriterType: () => java.lang.String = null,
    getDirectionParam: () => java.lang.String = null,
    getEnablePagingParams: () => scala.Boolean = null,
    getExtraParams: () => _ = null,
    getFilterParam: () => java.lang.String = null,
    getGroupParam: () => java.lang.String = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLimitParam: () => java.lang.String = null,
    getListeners: () => _ = null,
    getModel: () => _ = null,
    getNoCache: () => scala.Boolean = null,
    getPageParam: () => java.lang.String = null,
    getReader: () => _ = null,
    getRecordParam: () => java.lang.String = null,
    getSimpleSortMode: () => scala.Boolean = null,
    getSortParam: () => java.lang.String = null,
    getStartParam: () => java.lang.String = null,
    getTimeout: () => scala.Double = null,
    getWriter: () => _ = null,
    groupParam: java.lang.String = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    limitParam: java.lang.String = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    model: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    noCache: js.UndefOr[scala.Boolean] = js.undefined,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    pageParam: java.lang.String = null,
    platformConfig: js.Any = null,
    processResponse: (/* success */ js.UndefOr[scala.Boolean], /* operation */ js.UndefOr[IOperation], /* request */ js.UndefOr[IRequest], /* response */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    read: () => scala.Unit = null,
    reader: js.Any = null,
    recordParam: java.lang.String = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setApi: /* api */ js.UndefOr[js.Any] => scala.Unit = null,
    setAutoAppendParams: /* autoAppendParams */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setBatchActions: /* batchActions */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setBatchOrder: /* batchOrder */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => scala.Unit = null,
    setCacheString: /* cacheString */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setCallbackKey: /* callbackKey */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDefaultWriterType: /* defaultWriterType */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDirectionParam: /* directionParam */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setEnablePagingParams: /* enablePagingParams */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setExtraParam: (/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any]) => scala.Unit = null,
    setExtraParams: /* extraParams */ js.UndefOr[js.Any] => scala.Unit = null,
    setFilterParam: /* filterParam */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setGroupParam: /* groupParam */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setLimitParam: /* limitParam */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => scala.Unit = null,
    setModel: /* model */ js.UndefOr[js.Any] => scala.Unit = null,
    setNoCache: /* noCache */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setPageParam: /* pageParam */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setReader: /* reader */ js.UndefOr[js.Any] => scala.Unit = null,
    setRecordParam: /* recordParam */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setSimpleSortMode: /* simpleSortMode */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setSortParam: /* sortParam */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setStartParam: /* startParam */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setTimeout: /* timeout */ js.UndefOr[scala.Double] => scala.Unit = null,
    setUrl: /* url */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setWriter: /* writer */ js.UndefOr[js.Any] => scala.Unit = null,
    simpleSortMode: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sortParam: java.lang.String = null,
    startParam: java.lang.String = null,
    statics: js.Any = null,
    suspendEvents: () => scala.Unit = null,
    timeout: scala.Int | scala.Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    update: () => scala.Unit = null,
    url: java.lang.String = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    writer: js.Any = null
  ): IScriptTagProxy = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction0(abort))
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (afterRequest != null) __obj.updateDynamic("afterRequest")(js.Any.fromFunction2(afterRequest))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (api != null) __obj.updateDynamic("api")(api)
    if (!js.isUndefined(autoAppendParams)) __obj.updateDynamic("autoAppendParams")(autoAppendParams)
    if (batch != null) __obj.updateDynamic("batch")(js.Any.fromFunction1(batch))
    if (!js.isUndefined(batchActions)) __obj.updateDynamic("batchActions")(batchActions)
    if (batchOrder != null) __obj.updateDynamic("batchOrder")(batchOrder)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (buildRequest != null) __obj.updateDynamic("buildRequest")(js.Any.fromFunction1(buildRequest))
    if (buildUrl != null) __obj.updateDynamic("buildUrl")(js.Any.fromFunction1(buildUrl))
    if (cacheString != null) __obj.updateDynamic("cacheString")(cacheString)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (callbackKey != null) __obj.updateDynamic("callbackKey")(callbackKey)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction0(create))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (directionParam != null) __obj.updateDynamic("directionParam")(directionParam)
    if (doRequest != null) __obj.updateDynamic("doRequest")(js.Any.fromFunction3(doRequest))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (!js.isUndefined(enablePagingParams)) __obj.updateDynamic("enablePagingParams")(enablePagingParams)
    if (encodeFilters != null) __obj.updateDynamic("encodeFilters")(js.Any.fromFunction1(encodeFilters))
    if (encodeSorters != null) __obj.updateDynamic("encodeSorters")(js.Any.fromFunction1(encodeSorters))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (extraParams != null) __obj.updateDynamic("extraParams")(extraParams)
    if (filterParam != null) __obj.updateDynamic("filterParam")(filterParam)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getApi != null) __obj.updateDynamic("getApi")(js.Any.fromFunction0(getApi))
    if (getAutoAppendParams != null) __obj.updateDynamic("getAutoAppendParams")(js.Any.fromFunction0(getAutoAppendParams))
    if (getBatchActions != null) __obj.updateDynamic("getBatchActions")(js.Any.fromFunction0(getBatchActions))
    if (getBatchOrder != null) __obj.updateDynamic("getBatchOrder")(js.Any.fromFunction0(getBatchOrder))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCacheString != null) __obj.updateDynamic("getCacheString")(js.Any.fromFunction0(getCacheString))
    if (getCallbackKey != null) __obj.updateDynamic("getCallbackKey")(js.Any.fromFunction0(getCallbackKey))
    if (getDefaultWriterType != null) __obj.updateDynamic("getDefaultWriterType")(js.Any.fromFunction0(getDefaultWriterType))
    if (getDirectionParam != null) __obj.updateDynamic("getDirectionParam")(js.Any.fromFunction0(getDirectionParam))
    if (getEnablePagingParams != null) __obj.updateDynamic("getEnablePagingParams")(js.Any.fromFunction0(getEnablePagingParams))
    if (getExtraParams != null) __obj.updateDynamic("getExtraParams")(js.Any.fromFunction0(getExtraParams))
    if (getFilterParam != null) __obj.updateDynamic("getFilterParam")(js.Any.fromFunction0(getFilterParam))
    if (getGroupParam != null) __obj.updateDynamic("getGroupParam")(js.Any.fromFunction0(getGroupParam))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLimitParam != null) __obj.updateDynamic("getLimitParam")(js.Any.fromFunction0(getLimitParam))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction0(getModel))
    if (getNoCache != null) __obj.updateDynamic("getNoCache")(js.Any.fromFunction0(getNoCache))
    if (getPageParam != null) __obj.updateDynamic("getPageParam")(js.Any.fromFunction0(getPageParam))
    if (getReader != null) __obj.updateDynamic("getReader")(js.Any.fromFunction0(getReader))
    if (getRecordParam != null) __obj.updateDynamic("getRecordParam")(js.Any.fromFunction0(getRecordParam))
    if (getSimpleSortMode != null) __obj.updateDynamic("getSimpleSortMode")(js.Any.fromFunction0(getSimpleSortMode))
    if (getSortParam != null) __obj.updateDynamic("getSortParam")(js.Any.fromFunction0(getSortParam))
    if (getStartParam != null) __obj.updateDynamic("getStartParam")(js.Any.fromFunction0(getStartParam))
    if (getTimeout != null) __obj.updateDynamic("getTimeout")(js.Any.fromFunction0(getTimeout))
    if (getWriter != null) __obj.updateDynamic("getWriter")(js.Any.fromFunction0(getWriter))
    if (groupParam != null) __obj.updateDynamic("groupParam")(groupParam)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (limitParam != null) __obj.updateDynamic("limitParam")(limitParam)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (pageParam != null) __obj.updateDynamic("pageParam")(pageParam)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (processResponse != null) __obj.updateDynamic("processResponse")(js.Any.fromFunction6(processResponse))
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction0(read))
    if (reader != null) __obj.updateDynamic("reader")(reader)
    if (recordParam != null) __obj.updateDynamic("recordParam")(recordParam)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setApi != null) __obj.updateDynamic("setApi")(js.Any.fromFunction1(setApi))
    if (setAutoAppendParams != null) __obj.updateDynamic("setAutoAppendParams")(js.Any.fromFunction1(setAutoAppendParams))
    if (setBatchActions != null) __obj.updateDynamic("setBatchActions")(js.Any.fromFunction1(setBatchActions))
    if (setBatchOrder != null) __obj.updateDynamic("setBatchOrder")(js.Any.fromFunction1(setBatchOrder))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setCacheString != null) __obj.updateDynamic("setCacheString")(js.Any.fromFunction1(setCacheString))
    if (setCallbackKey != null) __obj.updateDynamic("setCallbackKey")(js.Any.fromFunction1(setCallbackKey))
    if (setDefaultWriterType != null) __obj.updateDynamic("setDefaultWriterType")(js.Any.fromFunction1(setDefaultWriterType))
    if (setDirectionParam != null) __obj.updateDynamic("setDirectionParam")(js.Any.fromFunction1(setDirectionParam))
    if (setEnablePagingParams != null) __obj.updateDynamic("setEnablePagingParams")(js.Any.fromFunction1(setEnablePagingParams))
    if (setExtraParam != null) __obj.updateDynamic("setExtraParam")(js.Any.fromFunction2(setExtraParam))
    if (setExtraParams != null) __obj.updateDynamic("setExtraParams")(js.Any.fromFunction1(setExtraParams))
    if (setFilterParam != null) __obj.updateDynamic("setFilterParam")(js.Any.fromFunction1(setFilterParam))
    if (setGroupParam != null) __obj.updateDynamic("setGroupParam")(js.Any.fromFunction1(setGroupParam))
    if (setLimitParam != null) __obj.updateDynamic("setLimitParam")(js.Any.fromFunction1(setLimitParam))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction1(setModel))
    if (setNoCache != null) __obj.updateDynamic("setNoCache")(js.Any.fromFunction1(setNoCache))
    if (setPageParam != null) __obj.updateDynamic("setPageParam")(js.Any.fromFunction1(setPageParam))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1(setReader))
    if (setRecordParam != null) __obj.updateDynamic("setRecordParam")(js.Any.fromFunction1(setRecordParam))
    if (setSimpleSortMode != null) __obj.updateDynamic("setSimpleSortMode")(js.Any.fromFunction1(setSimpleSortMode))
    if (setSortParam != null) __obj.updateDynamic("setSortParam")(js.Any.fromFunction1(setSortParam))
    if (setStartParam != null) __obj.updateDynamic("setStartParam")(js.Any.fromFunction1(setStartParam))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1(setTimeout))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1(setUrl))
    if (setWriter != null) __obj.updateDynamic("setWriter")(js.Any.fromFunction1(setWriter))
    if (!js.isUndefined(simpleSortMode)) __obj.updateDynamic("simpleSortMode")(simpleSortMode)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sortParam != null) __obj.updateDynamic("sortParam")(sortParam)
    if (startParam != null) __obj.updateDynamic("startParam")(startParam)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction0(update))
    if (url != null) __obj.updateDynamic("url")(url)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (writer != null) __obj.updateDynamic("writer")(writer)
    __obj.asInstanceOf[IScriptTagProxy]
  }
}

