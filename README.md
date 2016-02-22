# XSLT - Unsichere-Buchstaben
XSLT File which sets the background color for characters with an attribute > 0 to red.

##### Important XSLT Part:

```
<xsl:for-each select="root/images/image/block/paragraph/character">
  <tr>
    <xsl:choose>
      <xsl:when test="@attr >= 2">
         <td bgcolor="red">
         <xsl:value-of select="@value"/>
         </td>
      </xsl:when>
      <xsl:otherwise>
         <td><xsl:value-of select="@value"/></td>
      </xsl:otherwise>
    </xsl:choose>
	</tr>
</xsl:for-each>

```
