package typings
package shopifyDashPrimeLib.distServicesWebhooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/webhooks", "Webhooks")
@js.native
class Webhooks protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
    * Gets a count of all of the shop's webhooks.
    * @param options Options for filtering the results.
    */
  def count(): js.Promise[scala.Double] = js.native
  def count(options: shopifyDashPrimeLib.distOptionsWebhooksMod.WebhookOptions): js.Promise[scala.Double] = js.native
  /**
    * Creates a new webhook.
    */
  def create(webhook: shopifyDashPrimeLib.distModelsWebhookMod.Webhook): js.Promise[shopifyDashPrimeLib.distModelsWebhookMod.Webhook] = js.native
  /**
    * Deletes the webhook with the given id.
    */
  def delete(id: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Retrieves the webhook with the given id.
    * @param options Options for filtering the results.
    */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsWebhookMod.Webhook] = js.native
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[shopifyDashPrimeLib.distModelsWebhookMod.Webhook] = js.native
  /**
    * Gets a list of up to 250 of the shop's webhooks.
    * @param options Options for filtering the results.
    */
  def list(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsWebhookMod.Webhook]] = js.native
  def list(
    options: shopifyDashPrimeLib.distOptionsWebhooksMod.WebhookOptions with shopifyDashPrimeLib.distOptionsBaseMod.ListOptions with shopifyDashPrimeLib.distOptionsBaseMod.DateOptions with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
  ): js.Promise[js.Array[shopifyDashPrimeLib.distModelsWebhookMod.Webhook]] = js.native
  /**
    * Updates the webhook with the given id.
    * @param webhook The updated webhook.
    */
  def update(id: scala.Double, webhook: shopifyDashPrimeLib.distModelsWebhookMod.Webhook): js.Promise[shopifyDashPrimeLib.distModelsWebhookMod.Webhook] = js.native
}

