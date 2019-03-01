package typings
package atPulumiAwsLib.cognitoIdentityPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolArgs extends js.Object {
  /**
    * Whether the identity pool supports unauthenticated logins or not.
    */
  val allowUnauthenticatedIdentities: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * An array of Amazon Cognito Identity user pools and their client IDs.
    */
  val cognitoIdentityProviders: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ClientIdProviderName]]
    ]
  ] = js.undefined
  /**
    * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
    * backend and the Cognito service to communicate about the developer provider.
    */
  val developerProviderName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Cognito Identity Pool name.
    */
  val identityPoolName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A list of OpendID Connect provider ARNs.
    */
  val openidConnectProviderArns: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
    */
  val samlProviderArns: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Key-Value pairs mapping provider names to provider app IDs.
    */
  val supportedLoginProviders: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ]
  ] = js.undefined
}

object IdentityPoolArgs {
  @scala.inline
  def apply(
    identityPoolName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    allowUnauthenticatedIdentities: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    cognitoIdentityProviders: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ClientIdProviderName]]
    ] = null,
    developerProviderName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    openidConnectProviderArns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    samlProviderArns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    supportedLoginProviders: atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ] = null
  ): IdentityPoolArgs = {
    val __obj = js.Dynamic.literal(identityPoolName = identityPoolName.asInstanceOf[js.Any])
    if (allowUnauthenticatedIdentities != null) __obj.updateDynamic("allowUnauthenticatedIdentities")(allowUnauthenticatedIdentities.asInstanceOf[js.Any])
    if (cognitoIdentityProviders != null) __obj.updateDynamic("cognitoIdentityProviders")(cognitoIdentityProviders.asInstanceOf[js.Any])
    if (developerProviderName != null) __obj.updateDynamic("developerProviderName")(developerProviderName.asInstanceOf[js.Any])
    if (openidConnectProviderArns != null) __obj.updateDynamic("openidConnectProviderArns")(openidConnectProviderArns.asInstanceOf[js.Any])
    if (samlProviderArns != null) __obj.updateDynamic("samlProviderArns")(samlProviderArns.asInstanceOf[js.Any])
    if (supportedLoginProviders != null) __obj.updateDynamic("supportedLoginProviders")(supportedLoginProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolArgs]
  }
}

