import qrcode

ssid = "FORMACION"
eap = "PEAP"
identity = "Aprendiz141"
password = "xOU6I3S=Y6<J"

# Formato del QR para WPA/WPA2-Enterprise
wifi_config = f"WIFI:T:WPA-EAP;S:{ssid};E:{eap};I:{identity};P:{password};;"

qr = qrcode.QRCode(
    version=1,
    error_correction=qrcode.constants.ERROR_CORRECT_L,
    box_size=10,
    border=4,
)
qr.add_data(wifi_config)
qr.make(fit=True)

img = qr.make_image(fill='black', back_color='white')
img.save("wifi_qr.png")

print("Código QR generado y guardado como wifi_qr.png")
