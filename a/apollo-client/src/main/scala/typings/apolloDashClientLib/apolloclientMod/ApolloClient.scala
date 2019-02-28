package typings
package apolloDashClientLib.apolloclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloClient[TCacheShape]
  extends apolloDashCacheLib.libTypesDataProxyMod.DataProxy {
  var cache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape] = js.native
  var clearStoreCallbacks: js.Any = js.native
  var clientAwareness: js.Any = js.native
  var defaultOptions: DefaultOptions = js.native
  var devToolsHookCb: js.Any = js.native
  var disableNetworkFetches: scala.Boolean = js.native
  var initProxy: js.Any = js.native
  var link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink = js.native
  var proxy: js.Any = js.native
  var queryDeduplication: scala.Boolean = js.native
  var queryManager: js.UndefOr[apolloDashClientLib.coreQueryManagerMod.QueryManager[TCacheShape]] = js.native
  var resetStoreCallbacks: js.Any = js.native
  var ssrMode: js.Any = js.native
  var store: apolloDashClientLib.dataStoreMod.DataStore[TCacheShape] = js.native
  var version: java.lang.String = js.native
  def __actionHookForDevTools(cb: js.Function0[_]): scala.Unit = js.native
  def __requestRaw(payload: apolloDashLinkLib.libTypesMod.GraphQLRequest): apolloDashClientLib.utilObservableMod.Observable[
    graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
  ] = js.native
  def clearStore(): js.Promise[scala.Unit | scala.Null] = js.native
  def extract(): TCacheShape = js.native
  def extract(optimistic: scala.Boolean): TCacheShape = js.native
  def initQueryManager(): apolloDashClientLib.coreQueryManagerMod.QueryManager[TCacheShape] = js.native
  def mutate[T, TVariables](options: apolloDashClientLib.coreWatchQueryOptionsMod.MutationOptions[T, TVariables]): js.Promise[
    apolloDashLinkLib.libTypesMod.FetchResult[T, stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
  ] = js.native
  def onClearStore(cb: js.Function0[js.Promise[_]]): js.Function0[scala.Unit] = js.native
  def onResetStore(cb: js.Function0[js.Promise[_]]): js.Function0[scala.Unit] = js.native
  def query[T, TVariables](options: apolloDashClientLib.coreWatchQueryOptionsMod.QueryOptions[TVariables]): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[T]] = js.native
  def reFetchObservableQueries(): js.Promise[js.Array[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]] | js.Promise[scala.Null] = js.native
  def reFetchObservableQueries(includeStandby: scala.Boolean): js.Promise[js.Array[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]] | js.Promise[scala.Null] = js.native
  def resetStore(): js.Promise[js.Array[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]] | scala.Null] = js.native
  def restore(serializedState: TCacheShape): apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape] = js.native
  def stop(): scala.Unit = js.native
  def subscribe[T, TVariables](options: apolloDashClientLib.coreWatchQueryOptionsMod.SubscriptionOptions[TVariables]): apolloDashClientLib.utilObservableMod.Observable[T] = js.native
  def watchQuery[T, TVariables](options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[TVariables]): apolloDashClientLib.coreObservableQueryMod.ObservableQuery[T, TVariables] = js.native
}

