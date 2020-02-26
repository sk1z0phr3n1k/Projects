menu={}
menu['coffee']=4.25
menu['tea']=3.25
menu['cake']=3.75
del menu['tea']

print(menu.get('tea',2.89))

 