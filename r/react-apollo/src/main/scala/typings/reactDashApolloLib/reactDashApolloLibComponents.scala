package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashApolloLibComponents {
  @scala.inline
  def ApolloConsumer: reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.apolloConsumerMod.ApolloConsumerProps] = reactDashApolloLib.apolloConsumerMod.^.default.asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.apolloConsumerMod.ApolloConsumerProps]]
  @scala.inline
  def ApolloProvider[TCache]: reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.apolloProviderMod.ApolloProviderProps[TCache]] = js.constructorOf[reactDashApolloLib.apolloProviderMod.default[TCache]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.apolloProviderMod.ApolloProviderProps[TCache]]]
  @scala.inline
  def Mutation[TData, TVariables]: reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.mutationMod.MutationProps[TData, TVariables]] = js.constructorOf[reactDashApolloLib.mutationMod.default[TData, TVariables]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.mutationMod.MutationProps[TData, TVariables]]]
  @scala.inline
  def Query[TData, TVariables]: reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.queryMod.QueryProps[TData, TVariables]] = js.constructorOf[reactDashApolloLib.queryMod.default[TData, TVariables]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.queryMod.QueryProps[TData, TVariables]]]
  @scala.inline
  def Subscription[TData, TVariables]: reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.subscriptionsMod.SubscriptionProps[TData, TVariables]] = js.constructorOf[reactDashApolloLib.reactDashApolloMod.Subscription[TData, TVariables]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.subscriptionsMod.SubscriptionProps[TData, TVariables]]]
  @scala.inline
  def Subscriptions[TData, TVariables]: reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.subscriptionsMod.SubscriptionProps[TData, TVariables]] = js.constructorOf[reactDashApolloLib.subscriptionsMod.default[TData, TVariables]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reactDashApolloLib.subscriptionsMod.SubscriptionProps[TData, TVariables]]]
  @scala.inline
  def ApolloConsumerProps: reactDashApolloLib.apolloConsumerMod.ApolloConsumerProps.type = reactDashApolloLib.apolloConsumerMod.ApolloConsumerProps
  type ApolloConsumerProps = reactDashApolloLib.apolloConsumerMod.ApolloConsumerProps
  @scala.inline
  def ApolloProviderProps: reactDashApolloLib.apolloProviderMod.ApolloProviderProps.type = reactDashApolloLib.apolloProviderMod.ApolloProviderProps
  type ApolloProviderProps[TCache] = reactDashApolloLib.apolloProviderMod.ApolloProviderProps[TCache]
  @scala.inline
  def MutationProps: reactDashApolloLib.mutationMod.MutationProps.type = reactDashApolloLib.mutationMod.MutationProps
  type MutationProps[TData, TVariables] = reactDashApolloLib.mutationMod.MutationProps[TData, TVariables]
  @scala.inline
  def QueryProps: reactDashApolloLib.queryMod.QueryProps.type = reactDashApolloLib.queryMod.QueryProps
  type QueryProps[TData, TVariables] = reactDashApolloLib.queryMod.QueryProps[TData, TVariables]
  @scala.inline
  def SubscriptionProps: reactDashApolloLib.subscriptionsMod.SubscriptionProps.type = reactDashApolloLib.subscriptionsMod.SubscriptionProps
  type SubscriptionProps[TData, TVariables] = reactDashApolloLib.subscriptionsMod.SubscriptionProps[TData, TVariables]
}

