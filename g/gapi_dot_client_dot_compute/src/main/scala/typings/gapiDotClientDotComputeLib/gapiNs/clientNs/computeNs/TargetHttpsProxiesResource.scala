package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpsProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpsProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[TargetHttpsProxy]
  /** Creates a TargetHttpsProxy resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TargetHttpsProxyList]
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object TargetHttpsProxiesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpsProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetHttpsProxy]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetHttpsProxyList]
    ],
    setSslCertificates: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setUrlMap: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): TargetHttpsProxiesResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, setSslCertificates = setSslCertificates, setUrlMap = setUrlMap)
  
    __obj.asInstanceOf[TargetHttpsProxiesResource]
  }
}

