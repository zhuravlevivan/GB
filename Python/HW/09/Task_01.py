from telegram import Bot, Update
from telegram.ext import Updater, CommandHandler, MessageHandler, Filters

bot = Bot(token='')
updater = Updater(token='')
dispatcher = updater.dispatcher


def message(update, context):
    text = update.message.text.split()
    s = []
    for i in text:
        if 'абв' in i:
            continue
        else:
            s.append(i)

    context.bot.send_message(update.effective_chat.id, ' '.join(s))


message_handler = MessageHandler(Filters.text, message)


dispatcher.add_handler(message_handler)

updater.start_polling()
updater.idle()  # ctrl + c
