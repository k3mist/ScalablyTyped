package typings
package inDashAppDashPurchaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inDashAppDashPurchaseMod {
  type AmazonReceipt = js.Object | java.lang.String
  type AppleReceipt = java.lang.String
  type GoogleReceipt = inDashAppDashPurchaseLib.Anon_Date | java.lang.String
  type Receipt = UnityReceipt | AppleReceipt | GoogleReceipt | WindowsReceipt | AmazonReceipt | RokuReceipt
  type RokuReceipt = java.lang.String
  type UnityReceipt = js.Object | java.lang.String
  type WindowsReceipt = java.lang.String
}
