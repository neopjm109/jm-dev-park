export interface Ticket {
    id: string;
    createdAt: Date;
    updatedAt: Date;
    areaId: number;
    userId: string;
    type: string;
    minute: number;
    price: number;
    status: string;
    payMethod: string;
    payDate: string;
    cardCode: string;
    cardNumber: string;
}