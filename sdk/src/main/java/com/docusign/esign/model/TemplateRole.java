package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.RecipientEmailNotification;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class TemplateRole   {
  
  private String email = null;
  private String roleName = null;
  private String name = null;
  private String signingGroupId = null;
  private String inPersonSignerName = null;
  private String clientUserId = null;
  private String embeddedRecipientStartURL = null;
  private String defaultRecipient = null;
  private String accessCode = null;
  private String routingOrder = null;
  private RecipientEmailNotification emailNotification = null;
  private Tabs tabs = null;

  
  /**
   * Specifies the email associated with a role name.
   **/
  @ApiModelProperty(value = "Specifies the email associated with a role name.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
   **/
  @ApiModelProperty(value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  @JsonProperty("roleName")
  public String getRoleName() {
    return roleName;
  }
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  
  /**
   * Specifies the recipient's name.
   **/
  @ApiModelProperty(value = "Specifies the recipient's name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   **/
  @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  @JsonProperty("signingGroupId")
  public String getSigningGroupId() {
    return signingGroupId;
  }
  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }

  
  /**
   * Specifies the full legal name of the signer in person signer template roles.\n\nMaximum Length: 100 characters.
   **/
  @ApiModelProperty(value = "Specifies the full legal name of the signer in person signer template roles.\n\nMaximum Length: 100 characters.")
  @JsonProperty("inPersonSignerName")
  public String getInPersonSignerName() {
    return inPersonSignerName;
  }
  public void setInPersonSignerName(String inPersonSignerName) {
    this.inPersonSignerName = inPersonSignerName;
  }

  
  /**
   * Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters.
   **/
  @ApiModelProperty(value = "Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters.")
  @JsonProperty("clientUserId")
  public String getClientUserId() {
    return clientUserId;
  }
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  
  /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender’s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient’s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]`
   **/
  @ApiModelProperty(value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender’s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient’s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]`")
  @JsonProperty("embeddedRecipientStartURL")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }
  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }

  
  /**
   * When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient.
   **/
  @ApiModelProperty(value = "When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient.")
  @JsonProperty("defaultRecipient")
  public String getDefaultRecipient() {
    return defaultRecipient;
  }
  public void setDefaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
  }

  
  /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and must conform to account’s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then access code is not required.
   **/
  @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and must conform to account’s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then access code is not required.")
  @JsonProperty("accessCode")
  public String getAccessCode() {
    return accessCode;
  }
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  
  /**
   * Specifies the routing order of the recipient in the envelope.
   **/
  @ApiModelProperty(value = "Specifies the routing order of the recipient in the envelope.")
  @JsonProperty("routingOrder")
  public String getRoutingOrder() {
    return routingOrder;
  }
  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("emailNotification")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }
  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tabs")
  public Tabs getTabs() {
    return tabs;
  }
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateRole templateRole = (TemplateRole) o;
    return Objects.equals(email, templateRole.email) &&
        Objects.equals(roleName, templateRole.roleName) &&
        Objects.equals(name, templateRole.name) &&
        Objects.equals(signingGroupId, templateRole.signingGroupId) &&
        Objects.equals(inPersonSignerName, templateRole.inPersonSignerName) &&
        Objects.equals(clientUserId, templateRole.clientUserId) &&
        Objects.equals(embeddedRecipientStartURL, templateRole.embeddedRecipientStartURL) &&
        Objects.equals(defaultRecipient, templateRole.defaultRecipient) &&
        Objects.equals(accessCode, templateRole.accessCode) &&
        Objects.equals(routingOrder, templateRole.routingOrder) &&
        Objects.equals(emailNotification, templateRole.emailNotification) &&
        Objects.equals(tabs, templateRole.tabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, roleName, name, signingGroupId, inPersonSignerName, clientUserId, embeddedRecipientStartURL, defaultRecipient, accessCode, routingOrder, emailNotification, tabs);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRole {\n");
    
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    roleName: ").append(StringUtil.toIndentedString(roleName)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    signingGroupId: ").append(StringUtil.toIndentedString(signingGroupId)).append("\n");
    sb.append("    inPersonSignerName: ").append(StringUtil.toIndentedString(inPersonSignerName)).append("\n");
    sb.append("    clientUserId: ").append(StringUtil.toIndentedString(clientUserId)).append("\n");
    sb.append("    embeddedRecipientStartURL: ").append(StringUtil.toIndentedString(embeddedRecipientStartURL)).append("\n");
    sb.append("    defaultRecipient: ").append(StringUtil.toIndentedString(defaultRecipient)).append("\n");
    sb.append("    accessCode: ").append(StringUtil.toIndentedString(accessCode)).append("\n");
    sb.append("    routingOrder: ").append(StringUtil.toIndentedString(routingOrder)).append("\n");
    sb.append("    emailNotification: ").append(StringUtil.toIndentedString(emailNotification)).append("\n");
    sb.append("    tabs: ").append(StringUtil.toIndentedString(tabs)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
